package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.EmployeeEmergencyContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeEmergencyContactRepository extends JpaRepository<EmployeeEmergencyContact, Integer> {
}
