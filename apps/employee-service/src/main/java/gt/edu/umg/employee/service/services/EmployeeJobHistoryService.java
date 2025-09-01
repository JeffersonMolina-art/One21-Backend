package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.EmployeeJobHistoryDto;
import gt.edu.umg.employee.service.entities.EmployeeJobHistory;
import gt.edu.umg.employee.service.repositories.EmployeeJobHistoryRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeJobHistoryService extends GenericServiceImpl<EmployeeJobHistoryDto, EmployeeJobHistory, Integer> {
    private final EmployeeJobHistoryRepository employeeJobHistoryRepository;
    private final GenericMapper mapper;

    public EmployeeJobHistoryService(EmployeeJobHistoryRepository employeeJobHistoryRepository, GenericMapper mapper) {
        super(employeeJobHistoryRepository, mapper, EmployeeJobHistoryDto.class, EmployeeJobHistory.class);
        this.employeeJobHistoryRepository = employeeJobHistoryRepository;
        this.mapper = mapper;
    }
}

