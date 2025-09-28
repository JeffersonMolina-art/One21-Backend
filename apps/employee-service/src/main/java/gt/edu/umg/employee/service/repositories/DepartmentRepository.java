package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.EmployeeDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<EmployeeDepartment, Integer> {
}
