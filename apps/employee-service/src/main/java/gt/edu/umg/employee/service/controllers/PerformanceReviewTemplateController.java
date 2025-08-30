package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.PerformanceReviewTemplateDto;
import gt.edu.umg.employee.service.entities.PerformanceReviewTemplate;
import gt.edu.umg.employee.service.services.PerformanceReviewTemplateService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/performance-review-templates")
public class PerformanceReviewTemplateController extends GenericController<PerformanceReviewTemplateDto, PerformanceReviewTemplate, Integer> {
    private final PerformanceReviewTemplateService performanceReviewTemplateService;

    public PerformanceReviewTemplateController(PerformanceReviewTemplateService performanceReviewTemplateService) {
        super(performanceReviewTemplateService);
        this.performanceReviewTemplateService = performanceReviewTemplateService;
    }
}

