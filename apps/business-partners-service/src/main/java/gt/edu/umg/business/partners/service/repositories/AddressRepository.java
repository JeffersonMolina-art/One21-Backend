package gt.edu.umg.business.partners.service.repositories;

import gt.edu.umg.business.partners.service.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
@org.springframework.stereotype.Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}