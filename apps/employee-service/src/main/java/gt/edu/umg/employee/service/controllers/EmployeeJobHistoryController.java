package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.EmployeeJobHistoryDto;
import gt.edu.umg.employee.service.entities.EmployeeJobHistory;
import gt.edu.umg.employee.service.services.EmployeeJobHistoryService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/job-histories")
public class EmployeeJobHistoryController extends GenericController<EmployeeJobHistoryDto, EmployeeJobHistory, Integer> {
    private final EmployeeJobHistoryService employeeJobHistoryService;

    public EmployeeJobHistoryController(EmployeeJobHistoryService employeeJobHistoryService) {
        super(employeeJobHistoryService);
        this.employeeJobHistoryService = employeeJobHistoryService;
    }
}

