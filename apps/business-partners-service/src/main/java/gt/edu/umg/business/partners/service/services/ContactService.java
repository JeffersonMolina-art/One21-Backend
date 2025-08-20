package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.ContactDto;
import gt.edu.umg.business.partners.service.entities.Contact;
import gt.edu.umg.business.partners.service.repositories.ContactRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class ContactService extends GenericServiceImpl<ContactDto, Contact, Integer> {

    private final ContactRepository contactRepository;
    private final GenericMapper mapper;

    public ContactService(ContactRepository contactRepository, GenericMapper mapper) {
        super(contactRepository, mapper, ContactDto.class, Contact.class);
        this.contactRepository = contactRepository;
        this.mapper = mapper;
    }
}
