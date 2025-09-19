package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.EmployeeContractDto;
import gt.edu.umg.employee.service.entities.EmployeeContract;
import gt.edu.umg.employee.service.services.EmployeeContractService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees/contracts")
public class EmployeeContractController extends GenericController<EmployeeContractDto, EmployeeContract, Integer> {

    public EmployeeContractController(EmployeeContractService employeeContractService) {super(employeeContractService);}

}
