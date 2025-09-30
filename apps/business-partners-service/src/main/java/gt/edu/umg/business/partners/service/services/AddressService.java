package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.AddressDto;
import gt.edu.umg.business.partners.service.entities.Address;
import gt.edu.umg.business.partners.service.repositories.AddressRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;

import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AddressService extends GenericServiceImpl<AddressDto, Address, Integer> {

    private final AddressRepository addressRepository;
    private final GenericMapper mapper;

    public AddressService(AddressRepository addressRepository, GenericMapper mapper) {
        super(addressRepository, mapper, AddressDto.class, Address.class);
        this.addressRepository = addressRepository;
        this.mapper = mapper;
    }

    public List<AddressDto> findByPartner(Integer id) {
        List<Address> addresses = addressRepository.findByBusinessPartner_Id(id);
        return mapper.toDtoList(addresses , AddressDto.class);
    }
}
