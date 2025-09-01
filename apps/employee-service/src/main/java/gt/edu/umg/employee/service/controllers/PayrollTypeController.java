package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.PayrollTypeDto;
import gt.edu.umg.employee.service.entities.PayrollType;
import gt.edu.umg.employee.service.services.PayrollTypeService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee/payroll-types")
public class PayrollTypeController extends GenericController<PayrollTypeDto, PayrollType, Integer> {
    private final PayrollTypeService payrollTypeService;

    public PayrollTypeController(PayrollTypeService payrollTypeService) {
        super(payrollTypeService);
        this.payrollTypeService = payrollTypeService;
    }
}

