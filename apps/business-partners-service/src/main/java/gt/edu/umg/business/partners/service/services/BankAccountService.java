package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.BankAccountDto;
import gt.edu.umg.business.partners.service.entities.BankAccount;
import gt.edu.umg.business.partners.service.repositories.BankAccountRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService extends GenericServiceImpl<BankAccountDto, BankAccount, Integer> {

    private final BankAccountRepository bankAccountRepository;
    private final GenericMapper mapper;

    public BankAccountService(BankAccountRepository bankAccountRepository, GenericMapper mapper) {
        super(bankAccountRepository, mapper, BankAccountDto.class, BankAccount.class);
        this.bankAccountRepository = bankAccountRepository;
        this.mapper = mapper;
    }

}