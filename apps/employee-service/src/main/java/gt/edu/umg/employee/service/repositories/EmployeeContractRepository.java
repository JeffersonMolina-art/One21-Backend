package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.EmployeeContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeContractRepository extends JpaRepository<EmployeeContract, Integer> {
}
