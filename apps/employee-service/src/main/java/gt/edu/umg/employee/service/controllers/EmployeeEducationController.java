package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.EmployeeEducationDto;
import gt.edu.umg.employee.service.entities.EmployeeEducation;
import gt.edu.umg.employee.service.services.EmployeeEducationService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/educations")
public class EmployeeEducationController extends GenericController<EmployeeEducationDto, EmployeeEducation, Integer> {
    private final EmployeeEducationService employeeEducationService;

    public EmployeeEducationController(EmployeeEducationService employeeEducationService) {
        super(employeeEducationService);
        this.employeeEducationService = employeeEducationService;
    }
}

