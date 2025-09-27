package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.EmployeeDepartmentDto;
import gt.edu.umg.employee.service.entities.EmployeeDepartment;
import gt.edu.umg.employee.service.services.DepartmentService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees/departments")
public class DepartmentController extends GenericController<EmployeeDepartmentDto, EmployeeDepartment, Integer> {

    public DepartmentController(DepartmentService departmentService) {super(departmentService);}

}
