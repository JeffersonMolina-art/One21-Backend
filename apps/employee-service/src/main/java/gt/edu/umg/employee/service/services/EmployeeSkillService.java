package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.EmployeeSkillDto;
import gt.edu.umg.employee.service.entities.EmployeeSkill;
import gt.edu.umg.employee.service.repositories.EmployeeSkillRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeSkillService extends GenericServiceImpl<EmployeeSkillDto, EmployeeSkill, Integer> {
    private final EmployeeSkillRepository employeeSkillRepository;
    private final GenericMapper mapper;

    public EmployeeSkillService(EmployeeSkillRepository employeeSkillRepository, GenericMapper mapper) {
        super(employeeSkillRepository, mapper, EmployeeSkillDto.class, EmployeeSkill.class);
        this.employeeSkillRepository = employeeSkillRepository;
        this.mapper = mapper;
    }
}

