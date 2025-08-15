package gt.edu.umg.business.partners.service.repositories;

import gt.edu.umg.business.partners.service.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}