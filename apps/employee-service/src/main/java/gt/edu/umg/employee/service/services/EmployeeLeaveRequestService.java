package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.EmployeeLeaveRequestDto;
import gt.edu.umg.employee.service.entities.EmployeeLeaveRequest;
import gt.edu.umg.employee.service.repositories.EmployeeLeaveRequestRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeLeaveRequestService extends GenericServiceImpl<EmployeeLeaveRequestDto, EmployeeLeaveRequest, Integer> {
    private final EmployeeLeaveRequestRepository employeeLeaveRequestRepository;
    private final GenericMapper mapper;

    public EmployeeLeaveRequestService(EmployeeLeaveRequestRepository employeeLeaveRequestRepository, GenericMapper mapper) {
        super(employeeLeaveRequestRepository, mapper, EmployeeLeaveRequestDto.class, EmployeeLeaveRequest.class);
        this.employeeLeaveRequestRepository = employeeLeaveRequestRepository;
        this.mapper = mapper;
    }
}

