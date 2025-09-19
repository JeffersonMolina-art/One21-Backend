package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

