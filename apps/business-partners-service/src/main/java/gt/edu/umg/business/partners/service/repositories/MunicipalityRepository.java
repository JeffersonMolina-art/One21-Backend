package gt.edu.umg.business.partners.service.repositories;

import gt.edu.umg.business.partners.service.entities.Municipality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MunicipalityRepository extends JpaRepository<Municipality, Integer> {

    List<Municipality> findMunicipalitiesByDepartments_Id(Integer departmentId);
}