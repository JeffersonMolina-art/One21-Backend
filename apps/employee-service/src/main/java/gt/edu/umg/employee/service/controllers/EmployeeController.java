package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.EmployeeDto;
import gt.edu.umg.employee.service.entities.Employee;
import gt.edu.umg.employee.service.services.EmployeeService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeController extends GenericController <EmployeeDto, Employee, Integer>{

    public EmployeeController(EmployeeService employeeService) {super(employeeService);}
}
