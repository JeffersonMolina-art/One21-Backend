package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.ContractTypeDto;
import gt.edu.umg.employee.service.entities.ContractType;
import gt.edu.umg.employee.service.repositories.ContractTypeRepository;
import gt.edu.umg.generic.data.services.GenericService;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContractTypeService extends GenericServiceImpl<ContractTypeDto, ContractType, Integer> {

    private final ContractTypeRepository contractTypeRepository;
    private final GenericMapper mapper;

    public ContractTypeService(ContractTypeRepository contractTypeRepository, GenericMapper mapper) {
        super(contractTypeRepository, mapper, ContractTypeDto.class, ContractType.class);
        this.contractTypeRepository = contractTypeRepository;
        this.mapper = mapper;
    }
}
