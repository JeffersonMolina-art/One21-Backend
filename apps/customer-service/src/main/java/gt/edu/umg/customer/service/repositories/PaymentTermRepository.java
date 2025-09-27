package gt.edu.umg.customer.service.repositories;

import gt.edu.umg.customer.service.entities.PaymentTerm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTermRepository extends JpaRepository<PaymentTerm, Integer> {
}