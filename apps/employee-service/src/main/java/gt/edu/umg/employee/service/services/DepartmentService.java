package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.DepartmentDto;
import gt.edu.umg.employee.service.entities.Department;
import gt.edu.umg.employee.service.repositories.DepartmentRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DepartmentService extends GenericServiceImpl<DepartmentDto, Department, Integer> {
    private final DepartmentRepository departmentRepository;
    private final GenericMapper mapper;

    public DepartmentService(DepartmentRepository departmentRepository, GenericMapper mapper) {
        super(departmentRepository, mapper, DepartmentDto.class, Department.class);
        this.departmentRepository = departmentRepository;
        this.mapper = mapper;
    }
}

