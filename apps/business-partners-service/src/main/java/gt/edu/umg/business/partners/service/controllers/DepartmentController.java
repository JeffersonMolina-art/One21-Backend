package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.DepartmentDto;
import gt.edu.umg.business.partners.service.entities.Department;
import gt.edu.umg.business.partners.service.services.DepartmentService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("partners/departments")
public class DepartmentController extends GenericController<DepartmentDto, Department, Integer> {

    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        super(departmentService);
        this.departmentService = departmentService;
    }

    @GetMapping("/by-country{id}")
    public List<DepartmentDto> findByDepartmentForCountry(@PathVariable Integer id) {
        List<DepartmentDto> departmentDtos = departmentService.findByDepartmentForCountry(id);
        return departmentDtos;
    }
}
