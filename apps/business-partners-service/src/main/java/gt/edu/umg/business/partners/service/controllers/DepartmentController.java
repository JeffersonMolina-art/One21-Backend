package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.DepartmentDto;
import gt.edu.umg.business.partners.service.entities.Department;
import gt.edu.umg.business.partners.service.services.DepartmentService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("partners/departments")
public class DepartmentController extends GenericController<DepartmentDto, Department, Integer> {

    public DepartmentController(DepartmentService departmentService) {
        super(departmentService);
    }
}
