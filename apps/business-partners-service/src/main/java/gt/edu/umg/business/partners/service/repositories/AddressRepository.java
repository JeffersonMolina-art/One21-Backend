package gt.edu.umg.business.partners.service.repositories;

import gt.edu.umg.business.partners.service.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    public List<Address> findByBusinessPartner_Id(Integer id);
}