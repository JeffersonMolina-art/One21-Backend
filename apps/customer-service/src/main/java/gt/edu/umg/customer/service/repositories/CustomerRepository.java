package gt.edu.umg.customer.service.repositories;

import gt.edu.umg.customer.service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}