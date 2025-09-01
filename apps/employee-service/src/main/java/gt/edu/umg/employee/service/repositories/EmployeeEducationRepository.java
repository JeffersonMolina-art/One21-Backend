package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.EmployeeEducation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeEducationRepository extends JpaRepository<EmployeeEducation, Integer> {
}

