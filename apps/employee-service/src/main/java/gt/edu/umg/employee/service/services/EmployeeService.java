package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.EmployeeDto;
import gt.edu.umg.employee.service.entities.Employee;
import gt.edu.umg.employee.service.repositories.EmployeeRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class EmployeeService extends GenericServiceImpl<EmployeeDto, Employee, Integer> {

    private final EmployeeRepository employeeRepository;
    private  final GenericMapper mapper;

    public EmployeeService(EmployeeRepository employeeRepository, GenericMapper mapper){
        super(employeeRepository, mapper, EmployeeDto.class, Employee.class);
        this.employeeRepository = employeeRepository;
        this.mapper = mapper;
    }

    @Transactional(readOnly = true)
    public List<EmployeeDto> listFlat() {
        return employeeRepository.findAllFlat();
    }

    public EmployeeDto findByBusinessPartnerId(Integer businessPartnerId) {
        Employee employee = employeeRepository.findEmployeeByBusinessPartnerId(businessPartnerId);
        return mapper.toDto(employee, EmployeeDto.class);
    }
}

