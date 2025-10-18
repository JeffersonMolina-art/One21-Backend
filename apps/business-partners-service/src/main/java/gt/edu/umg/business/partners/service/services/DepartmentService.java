package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.DepartmentDto;
import gt.edu.umg.business.partners.service.entities.Department;
import gt.edu.umg.business.partners.service.repositories.DepartmentRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService extends GenericServiceImpl<DepartmentDto, Department, Integer> {
    private final DepartmentRepository departmentRepository;
    private final GenericMapper mapper;

    public DepartmentService(DepartmentRepository stateRepository, GenericMapper mapper) {
        super(stateRepository, mapper, DepartmentDto.class, Department.class);
        this.departmentRepository = stateRepository;
        this.mapper = mapper;
    }

    public List<DepartmentDto> findByDepartmentForCountry(Integer id) {
        List<Department> departments = departmentRepository.findDepartmentByCountry_Id(id);
        return mapper.toDtoList(departments , DepartmentDto.class);
    }
}
