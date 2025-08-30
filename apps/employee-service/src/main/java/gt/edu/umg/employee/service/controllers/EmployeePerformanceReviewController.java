package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.EmployeePerformanceReviewDto;
import gt.edu.umg.employee.service.entities.EmployeePerformanceReview;
import gt.edu.umg.employee.service.services.EmployeePerformanceReviewService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/performance-reviews")
public class EmployeePerformanceReviewController extends GenericController<EmployeePerformanceReviewDto, EmployeePerformanceReview, Integer> {
    private final EmployeePerformanceReviewService employeePerformanceReviewService;

    public EmployeePerformanceReviewController(EmployeePerformanceReviewService employeePerformanceReviewService) {
        super(employeePerformanceReviewService);
        this.employeePerformanceReviewService = employeePerformanceReviewService;
    }
}

