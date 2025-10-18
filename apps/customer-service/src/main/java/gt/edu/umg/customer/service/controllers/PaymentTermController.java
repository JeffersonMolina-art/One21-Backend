package gt.edu.umg.customer.service.controllers;

import gt.edu.umg.customer.service.dtos.PaymentTermDto;
import gt.edu.umg.customer.service.entities.PaymentTerm;
import gt.edu.umg.customer.service.services.PaymentTermService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment-terms")
public class PaymentTermController extends GenericController<PaymentTermDto, PaymentTerm, Integer> {

    public PaymentTermController(PaymentTermService paymentTermService) {super(paymentTermService);}

}
