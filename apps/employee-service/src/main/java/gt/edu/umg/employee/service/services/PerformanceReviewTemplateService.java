package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.PerformanceReviewTemplateDto;
import gt.edu.umg.employee.service.entities.PerformanceReviewTemplate;
import gt.edu.umg.employee.service.repositories.PerformanceReviewTemplateRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PerformanceReviewTemplateService extends GenericServiceImpl<PerformanceReviewTemplateDto, PerformanceReviewTemplate, Integer> {
    private final PerformanceReviewTemplateRepository performanceReviewTemplateRepository;
    private final GenericMapper mapper;

    public PerformanceReviewTemplateService(PerformanceReviewTemplateRepository performanceReviewTemplateRepository, GenericMapper mapper) {
        super(performanceReviewTemplateRepository, mapper, PerformanceReviewTemplateDto.class, PerformanceReviewTemplate.class);
        this.performanceReviewTemplateRepository = performanceReviewTemplateRepository;
        this.mapper = mapper;
    }
}
