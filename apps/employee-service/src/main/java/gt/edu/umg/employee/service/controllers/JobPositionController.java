package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.JobPositionDto;
import gt.edu.umg.employee.service.entities.JobPosition;
import gt.edu.umg.employee.service.services.JobPositionService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/job-positions")
public class JobPositionController extends GenericController<JobPositionDto, JobPosition, Integer> {
    private final JobPositionService jobPositionService;

    public JobPositionController(JobPositionService jobPositionService) {
        super(jobPositionService);
        this.jobPositionService = jobPositionService;
    }
}

