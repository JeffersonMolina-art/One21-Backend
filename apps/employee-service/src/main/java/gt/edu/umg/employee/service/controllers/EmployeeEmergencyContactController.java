package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.EmployeeEmergencyContactDto;
import gt.edu.umg.employee.service.entities.EmployeeEmergencyContact;
import gt.edu.umg.employee.service.services.EmployeeEmergencyContractService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emergency-contacts")
public class EmployeeEmergencyContactController extends GenericController<EmployeeEmergencyContactDto, EmployeeEmergencyContact, Integer> {

    public EmployeeEmergencyContactController(EmployeeEmergencyContractService employeeEmergencyContractService) {super(employeeEmergencyContractService);}

}
