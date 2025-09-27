package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.EmployeeEmergencyContactDto;
import gt.edu.umg.employee.service.entities.EmployeeEmergencyContact;
import gt.edu.umg.employee.service.repositories.EmployeeEmergencyContactRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeEmergencyContractService extends GenericServiceImpl<EmployeeEmergencyContactDto, EmployeeEmergencyContact, Integer> {

    private final EmployeeEmergencyContactRepository employeeEmergencyContactRepository;
    private final GenericMapper mapper;

    public EmployeeEmergencyContractService(EmployeeEmergencyContactRepository employeeEmergencyContactRepository, GenericMapper mapper){
        super(employeeEmergencyContactRepository, mapper, EmployeeEmergencyContactDto.class, EmployeeEmergencyContact.class);
        this.employeeEmergencyContactRepository = employeeEmergencyContactRepository;
        this.mapper = mapper;
    }
}
