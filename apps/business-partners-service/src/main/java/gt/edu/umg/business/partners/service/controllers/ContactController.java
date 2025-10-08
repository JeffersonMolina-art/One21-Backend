package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.ContactDto;
import gt.edu.umg.business.partners.service.entities.Contact;
import gt.edu.umg.business.partners.service.services.ContactService;
import gt.edu.umg.generic.data.controllers.GenericController;
import gt.edu.umg.generic.data.services.GenericService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("contacts")
public class ContactController extends GenericController<ContactDto, Contact, Integer> {

    public  final ContactService contactService;

    public ContactController(ContactService contactService) {
        super(contactService);
        this.contactService = contactService;
    }

    @GetMapping("/by-partner/{id}")
    public List<ContactDto> findByPartner(@PathVariable Integer id) {
        return contactService.findByPartner(id);
    }
}
