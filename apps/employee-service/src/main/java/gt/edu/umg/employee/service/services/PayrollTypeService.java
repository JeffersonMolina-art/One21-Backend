package gt.edu.umg.employee.service.services;

import gt.edu.umg.employee.service.dtos.PayrollTypeDto;
import gt.edu.umg.employee.service.entities.PayrollType;
import gt.edu.umg.employee.service.repositories.PayrollTypeRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PayrollTypeService extends GenericServiceImpl<PayrollTypeDto, PayrollType, Integer> {
    private final PayrollTypeRepository payrollTypeRepository;
    private final GenericMapper mapper;

    public PayrollTypeService(PayrollTypeRepository payrollTypeRepository, GenericMapper mapper) {
        super(payrollTypeRepository, mapper, PayrollTypeDto.class, PayrollType.class);
        this.payrollTypeRepository = payrollTypeRepository;
        this.mapper = mapper;
    }
}

