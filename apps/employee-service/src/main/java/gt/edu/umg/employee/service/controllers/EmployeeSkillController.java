package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.EmployeeSkillDto;
import gt.edu.umg.employee.service.entities.EmployeeSkill;
import gt.edu.umg.employee.service.services.EmployeeSkillService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/skills")
public class EmployeeSkillController extends GenericController<EmployeeSkillDto, EmployeeSkill, Integer> {
    private final EmployeeSkillService employeeSkillService;

    public EmployeeSkillController(EmployeeSkillService employeeSkillService) {
        super(employeeSkillService);
        this.employeeSkillService = employeeSkillService;
    }
}

