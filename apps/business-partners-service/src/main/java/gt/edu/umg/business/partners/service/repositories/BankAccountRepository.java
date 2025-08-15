package gt.edu.umg.business.partners.service.repositories;

import gt.edu.umg.business.partners.service.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {
}