package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.DepartmentDto;
import gt.edu.umg.employee.service.entities.Department;
import gt.edu.umg.employee.service.services.DepartmentService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/departments")
public class DepartmentController extends GenericController<DepartmentDto, Department, Integer> {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        super(departmentService);
        this.departmentService = departmentService;
    }
}

