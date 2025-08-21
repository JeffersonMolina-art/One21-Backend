package gt.edu.umg.business.partners.service.repositories;

import gt.edu.umg.business.partners.service.entities.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, Integer> {
}