package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.JobPositionDto;
import gt.edu.umg.employee.service.entities.JobPosition;
import gt.edu.umg.employee.service.services.JobPositionService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("job-position")
public class JobPosistionController extends GenericController<JobPositionDto, JobPosition, Integer> {

    public JobPosistionController(JobPositionService jobPositionService) {super(jobPositionService);}

}
