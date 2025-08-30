package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.EmployeeJobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJobHistoryRepository extends JpaRepository<EmployeeJobHistory, Integer> {
}

