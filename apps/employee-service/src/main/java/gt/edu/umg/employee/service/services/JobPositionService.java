package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.JobPositionDto;
import gt.edu.umg.employee.service.entities.JobPosition;
import gt.edu.umg.employee.service.repositories.JobPositionRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JobPositionService extends GenericServiceImpl<JobPositionDto, JobPosition, Integer> {

    private final JobPositionRepository jobPositionRepository;
    private final GenericMapper mapper;

    public JobPositionService(JobPositionRepository jobPositionRepository, GenericMapper mapper){
        super(jobPositionRepository, mapper, JobPositionDto.class, JobPosition.class);
        this.jobPositionRepository = jobPositionRepository;
        this.mapper = mapper;
    }

}
