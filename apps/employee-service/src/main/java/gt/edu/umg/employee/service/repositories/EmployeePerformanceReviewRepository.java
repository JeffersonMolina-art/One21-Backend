package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.EmployeePerformanceReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeePerformanceReviewRepository extends JpaRepository<EmployeePerformanceReview, Integer> {
}

