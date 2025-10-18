package gt.edu.umg.customer.service.controllers;

import gt.edu.umg.customer.service.dtos.CustomerDto;
import gt.edu.umg.customer.service.entities.Customer;
import gt.edu.umg.customer.service.services.CustomerService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController extends GenericController<CustomerDto, Customer, Integer> {

    public CustomerController(CustomerService customerService) {super(customerService);}

}
