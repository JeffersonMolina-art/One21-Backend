package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.EmployeeLeaveRequestDto;
import gt.edu.umg.employee.service.entities.EmployeeLeaveRequest;
import gt.edu.umg.employee.service.services.EmployeeLeaveRequestService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/leave-requests")
public class EmployeeLeaveRequestController extends GenericController<EmployeeLeaveRequestDto, EmployeeLeaveRequest, Integer> {
    private final EmployeeLeaveRequestService employeeLeaveRequestService;

    public EmployeeLeaveRequestController(EmployeeLeaveRequestService employeeLeaveRequestService) {
        super(employeeLeaveRequestService);
        this.employeeLeaveRequestService = employeeLeaveRequestService;
    }
}

