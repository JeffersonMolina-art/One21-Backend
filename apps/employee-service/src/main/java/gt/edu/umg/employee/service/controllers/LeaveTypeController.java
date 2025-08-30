package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.LeaveTypeDto;
import gt.edu.umg.employee.service.entities.LeaveType;
import gt.edu.umg.employee.service.services.LeaveTypeService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/leave-types")
public class LeaveTypeController extends GenericController<LeaveTypeDto, LeaveType, Integer> {
    private final LeaveTypeService leaveTypeService;

    public LeaveTypeController(LeaveTypeService leaveTypeService) {
        super(leaveTypeService);
        this.leaveTypeService = leaveTypeService;
    }
}

