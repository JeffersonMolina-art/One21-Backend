package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionRepository extends JpaRepository<JobPosition, Integer> {
}
