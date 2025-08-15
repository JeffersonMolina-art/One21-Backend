package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.ContactDto;
import gt.edu.umg.business.partners.service.entities.Contact;
import gt.edu.umg.business.partners.service.services.ContactService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class ContactController extends GenericController<ContactDto, Contact, Integer> {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        super(contactService);
        this.contactService = contactService;
    }
}
