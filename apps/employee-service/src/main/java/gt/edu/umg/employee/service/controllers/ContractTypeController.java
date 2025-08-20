package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.ContractTypeDto;
import gt.edu.umg.employee.service.entities.ContractType;
import gt.edu.umg.employee.service.services.ContractTypeService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/contract-types")
public class ContractTypeController extends GenericController <ContractTypeDto, ContractType, Integer>{

    private final ContractTypeService contractTypeService;

    public ContractTypeController(ContractTypeService contractTypeService) {
        super(contractTypeService);
        this.contractTypeService = contractTypeService;
    }

}
