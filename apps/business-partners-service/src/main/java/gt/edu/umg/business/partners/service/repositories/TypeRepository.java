package gt.edu.umg.business.partners.service.repositories;

import gt.edu.umg.business.partners.service.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {
}