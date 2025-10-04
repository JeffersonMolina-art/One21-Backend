package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.AddressDto;
import gt.edu.umg.business.partners.service.entities.Address;
import gt.edu.umg.business.partners.service.services.AddressService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("addresses")
public class AddressController extends GenericController<AddressDto, Address, Integer> {

    private AddressService addressService;

    public AddressController(AddressService addressService) {
        super(addressService);
        this.addressService = addressService;
    }

    @GetMapping("/by-partner/{id}")
    public List<AddressDto> findByPartner(@PathVariable Integer id) {
        return addressService.findByPartner(id);
    }
}
