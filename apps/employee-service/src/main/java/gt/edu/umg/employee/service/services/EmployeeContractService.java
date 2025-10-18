package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.EmployeeContractDto;
import gt.edu.umg.employee.service.entities.EmployeeContract;
import gt.edu.umg.employee.service.repositories.EmployeeContractRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeContractService extends GenericServiceImpl<EmployeeContractDto, EmployeeContract, Integer> {

    private final EmployeeContractRepository employeeContractRepository;
    private final GenericMapper mapper;

    public EmployeeContractService(EmployeeContractRepository employeeContractRepository, GenericMapper mapper){
        super(employeeContractRepository, mapper, EmployeeContractDto.class, EmployeeContract.class);
        this.employeeContractRepository = employeeContractRepository;
        this.mapper = mapper;
    }
}
