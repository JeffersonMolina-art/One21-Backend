package gt.edu.umg.customer.service.controllers;

import gt.edu.umg.customer.service.dtos.CustomerGroupDto;
import gt.edu.umg.customer.service.entities.CustomerGroup;
import gt.edu.umg.customer.service.services.CustomerGroupService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers/groups")
public class CustomerGroupController extends GenericController<CustomerGroupDto, CustomerGroup, Integer> {

    public CustomerGroupController(CustomerGroupService customerGroupService) {super(customerGroupService);}

}
