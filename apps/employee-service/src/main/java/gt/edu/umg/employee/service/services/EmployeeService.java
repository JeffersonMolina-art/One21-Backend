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

    public EmployeeService(EmployeeRepository employeeRepository, GenericMapper mapper){
        super(employeeRepository, mapper, EmployeeDto.class, Employee.class);
        this.employeeRepository = employeeRepository;
    }

    @Transactional(readOnly = true)
    public List<EmployeeDto> listFlat() {
        return employeeRepository.findAllFlat();
    }
}
