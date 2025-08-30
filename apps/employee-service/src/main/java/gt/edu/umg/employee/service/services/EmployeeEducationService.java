package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.EmployeeEducationDto;
import gt.edu.umg.employee.service.entities.EmployeeEducation;
import gt.edu.umg.employee.service.repositories.EmployeeEducationRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeEducationService extends GenericServiceImpl<EmployeeEducationDto, EmployeeEducation, Integer> {
    private final EmployeeEducationRepository employeeEducationRepository;
    private final GenericMapper mapper;

    public EmployeeEducationService(EmployeeEducationRepository employeeEducationRepository, GenericMapper mapper) {
        super(employeeEducationRepository, mapper, EmployeeEducationDto.class, EmployeeEducation.class);
        this.employeeEducationRepository = employeeEducationRepository;
        this.mapper = mapper;
    }
}

