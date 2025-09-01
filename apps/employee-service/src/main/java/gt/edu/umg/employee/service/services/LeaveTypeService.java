package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.LeaveTypeDto;
import gt.edu.umg.employee.service.entities.LeaveType;
import gt.edu.umg.employee.service.repositories.LeaveTypeRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LeaveTypeService extends GenericServiceImpl<LeaveTypeDto, LeaveType, Integer> {
    private final LeaveTypeRepository leaveTypeRepository;
    private final GenericMapper mapper;

    public LeaveTypeService(LeaveTypeRepository leaveTypeRepository, GenericMapper mapper) {
        super(leaveTypeRepository, mapper, LeaveTypeDto.class, LeaveType.class);
        this.leaveTypeRepository = leaveTypeRepository;
        this.mapper = mapper;
    }
}

