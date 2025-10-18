package gt.edu.umg.customer.service.repositories;

import gt.edu.umg.customer.service.entities.CustomerGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerGroupRepository extends JpaRepository<CustomerGroup, Integer> {
}