package gt.edu.umg.customer.service.services;

import gt.edu.umg.customer.service.dtos.PaymentTermDto;
import gt.edu.umg.customer.service.entities.PaymentTerm;
import gt.edu.umg.customer.service.repositories.PaymentTermRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaymentTermService extends GenericServiceImpl<PaymentTermDto, PaymentTerm, Integer> {

    private final PaymentTermRepository paymentTermRepository;
    private final GenericMapper mapper;

    public PaymentTermService(PaymentTermRepository paymentTermRepository, GenericMapper mapper){
        super(paymentTermRepository, mapper, PaymentTermDto.class, PaymentTerm.class);
        this.paymentTermRepository = paymentTermRepository;
        this.mapper = mapper;
    }
}
