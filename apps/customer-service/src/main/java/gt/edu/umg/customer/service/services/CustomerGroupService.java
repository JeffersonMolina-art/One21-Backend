package gt.edu.umg.customer.service.services;

import gt.edu.umg.customer.service.dtos.CustomerGroupDto;
import gt.edu.umg.customer.service.entities.CustomerGroup;
import gt.edu.umg.customer.service.repositories.CustomerGroupRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerGroupService extends GenericServiceImpl<CustomerGroupDto, CustomerGroup, Integer> {

    private final CustomerGroupRepository customerGroupRepository;
    private final GenericMapper mapper;

    public CustomerGroupService(CustomerGroupRepository customerGroupRepository, GenericMapper mapper){
        super(customerGroupRepository, mapper, CustomerGroupDto.class, CustomerGroup.class);
        this.customerGroupRepository = customerGroupRepository;
        this.mapper = mapper;
    }
}
