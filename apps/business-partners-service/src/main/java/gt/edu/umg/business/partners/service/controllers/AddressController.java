package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.AddressDto;
import gt.edu.umg.business.partners.service.entities.Address;
import gt.edu.umg.business.partners.service.services.AddressService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/business-partners/addresses/")
public class AddressController extends GenericController<AddressDto, Address, Integer> {

    public AddressController(AddressService addressService) {
        super(addressService);
    }


}
