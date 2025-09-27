package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.DepartmentDto;
import gt.edu.umg.business.partners.service.entities.Department;
import gt.edu.umg.business.partners.service.repositories.DepartmentRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends GenericServiceImpl<DepartmentDto, Department, Integer> {
    private final DepartmentRepository stateRepository;
    private final GenericMapper mapper;

    public DepartmentService(DepartmentRepository stateRepository, GenericMapper mapper) {
        super(stateRepository, mapper, DepartmentDto.class, Department.class);
        this.stateRepository = stateRepository;
        this.mapper = mapper;
    }

}
