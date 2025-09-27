package gt.edu.umg.customer.service.services;

import gt.edu.umg.customer.service.dtos.CustomerDto;
import gt.edu.umg.customer.service.entities.Customer;
import gt.edu.umg.customer.service.repositories.CustomerRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerService extends GenericServiceImpl<CustomerDto, Customer, Integer> {

    private final CustomerRepository customerRepository;
    private final GenericMapper mapper;

    public CustomerService(CustomerRepository customerRepository, GenericMapper mapper){
        super(customerRepository, mapper, CustomerDto.class, Customer.class);
        this.customerRepository = customerRepository;
        this.mapper = mapper;
    }
}
