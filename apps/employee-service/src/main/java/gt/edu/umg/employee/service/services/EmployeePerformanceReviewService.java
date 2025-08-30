package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.EmployeePerformanceReviewDto;
import gt.edu.umg.employee.service.entities.EmployeePerformanceReview;
import gt.edu.umg.employee.service.repositories.EmployeePerformanceReviewRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeePerformanceReviewService extends GenericServiceImpl<EmployeePerformanceReviewDto, EmployeePerformanceReview, Integer> {
    private final EmployeePerformanceReviewRepository employeePerformanceReviewRepository;
    private final GenericMapper mapper;

    public EmployeePerformanceReviewService(EmployeePerformanceReviewRepository employeePerformanceReviewRepository, GenericMapper mapper) {
        super(employeePerformanceReviewRepository, mapper, EmployeePerformanceReviewDto.class, EmployeePerformanceReview.class);
        this.employeePerformanceReviewRepository = employeePerformanceReviewRepository;
        this.mapper = mapper;
    }
}

