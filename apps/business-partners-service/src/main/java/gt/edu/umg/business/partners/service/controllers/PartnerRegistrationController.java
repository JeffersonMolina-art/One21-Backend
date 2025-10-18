package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.PartnerDto;
import gt.edu.umg.business.partners.service.dtos.PartnerRegistrationDto;
import gt.edu.umg.business.partners.service.entities.Address;
import gt.edu.umg.business.partners.service.entities.Contact;
import gt.edu.umg.business.partners.service.entities.Municipality;
import gt.edu.umg.business.partners.service.entities.Partner;
import gt.edu.umg.business.partners.service.repositories.AddressRepository;
import gt.edu.umg.business.partners.service.repositories.ContactRepository;
import gt.edu.umg.business.partners.service.repositories.MunicipalityRepository;
import gt.edu.umg.business.partners.service.services.PartnerService;
import gt.edu.umg.generic.data.utils.GenericMapper;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/register")
public class PartnerRegistrationController {

    private final PartnerService partnerService;
    private final ContactRepository contactRepository;
    private final AddressRepository addressRepository;
    private final MunicipalityRepository municipalityRepository;
    private final GenericMapper mapper;

    public PartnerRegistrationController(
            PartnerService partnerService,
            ContactRepository contactRepository,
            AddressRepository addressRepository,
            MunicipalityRepository municipalityRepository,
            GenericMapper mapper) {
        this.partnerService = partnerService;
        this.contactRepository = contactRepository;
        this.addressRepository = addressRepository;
        this.municipalityRepository = municipalityRepository;
        this.mapper = mapper;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Map<String, Object>> registerPartner(@Valid @RequestBody PartnerRegistrationDto registrationDto) {
        log.info("Registrando nuevo partner: {}", registrationDto.getName());

        try {
            // 1. Crear el Partner
            PartnerDto partnerDto = new PartnerDto();
            partnerDto.setCode(registrationDto.getCode());
            partnerDto.setName(registrationDto.getName());
            partnerDto.setTaxId(registrationDto.getTaxId());
            partnerDto.setEmail(registrationDto.getEmail());
            partnerDto.setNotes(registrationDto.getNotes());

            // Valores por defecto para nuevo registro
            partnerDto.setIsActive(true);
            partnerDto.setIsCustomer(true);
            partnerDto.setIsVendor(false);
            partnerDto.setIsEmployee(false);
            partnerDto.setCreatedAt(Instant.now());
            partnerDto.setUpdatedAt(Instant.now());

            // Guardar el partner
            PartnerDto savedPartnerDto = partnerService.save(partnerDto);
            Partner savedPartner = mapper.toEntity(savedPartnerDto, Partner.class);

            log.info("Partner registrado exitosamente con ID: {}", savedPartner.getId());

            // 2. Crear los contactos si existen
            List<Contact> savedContacts = new ArrayList<>();
            if (registrationDto.getContacts() != null && !registrationDto.getContacts().isEmpty()) {
                for (PartnerRegistrationDto.ContactRegistrationDto contactDto : registrationDto.getContacts()) {
                    Contact contact = new Contact();
                    contact.setFirstName(contactDto.getFirstName());
                    contact.setLastName(contactDto.getLastName());
                    contact.setPhone(contactDto.getPhone());
                    contact.setBirthDate(contactDto.getBirthDate());
                    contact.setBusinessPartner(savedPartner);
                    contact.setIsActive(true);
                    contact.setCreatedAt(Instant.now());
                    contact.setUpdatedAt(Instant.now());

                    Contact savedContact = contactRepository.save(contact);
                    savedContacts.add(savedContact);
                    log.info("Contacto creado: {} {}", savedContact.getFirstName(), savedContact.getLastName());
                }
            }

            // 3. Crear las direcciones si existen
            List<Address> savedAddresses = new ArrayList<>();
            if (registrationDto.getAddresses() != null && !registrationDto.getAddresses().isEmpty()) {
                for (PartnerRegistrationDto.AddressRegistrationDto addressDto : registrationDto.getAddresses()) {
                    // Verificar que el municipio existe
                    Municipality municipality = municipalityRepository.findById(addressDto.getMunicipalityId())
                            .orElseThrow(() -> new RuntimeException("Municipio no encontrado con ID: " + addressDto.getMunicipalityId()));

                    Address address = new Address();
                    address.setAddressType(addressDto.getAddressType() != null ? addressDto.getAddressType() : "BILLING");
                    address.setStreet(addressDto.getStreet());
                    address.setStreet2(addressDto.getStreet2());
                    address.setNeighborhood(addressDto.getNeighborhood());
                    address.setPostalCode(addressDto.getPostalCode());
                    address.setIsDefault(addressDto.getIsDefault() != null ? addressDto.getIsDefault() : false);
                    address.setBusinessPartner(savedPartner);
                    address.setMunicipality(municipality);
                    address.setIsActive(true);
                    address.setCreatedAt(Instant.now());
                    address.setUpdatedAt(Instant.now());

                    Address savedAddress = addressRepository.save(address);
                    savedAddresses.add(savedAddress);
                    log.info("Dirección creada: {}", savedAddress.getStreet());
                }
            }

            // Preparar respuesta
            Map<String, Object> response = new HashMap<>();
            response.put("partner", savedPartnerDto);
            response.put("contactsCreated", savedContacts.size());
            response.put("addressesCreated", savedAddresses.size());
            response.put("message", "Partner registrado exitosamente con todos sus datos");

            return ResponseEntity.status(HttpStatus.CREATED).body(response);

        } catch (Exception e) {
            log.error("Error al registrar partner: {}", e.getMessage(), e);
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Error al registrar el partner");
            errorResponse.put("message", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }
}
