package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.BankAccountDto;
import gt.edu.umg.business.partners.service.entities.BankAccount;
import gt.edu.umg.business.partners.service.services.BankAccountService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("bank-accounts")
class BankAccountController extends GenericController<BankAccountDto, BankAccount, Integer> {

    public BankAccountController(BankAccountService bankAccountService) {
        super(bankAccountService);
    }
}
