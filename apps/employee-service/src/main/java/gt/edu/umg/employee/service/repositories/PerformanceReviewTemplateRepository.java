package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.PerformanceReviewTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceReviewTemplateRepository extends JpaRepository<PerformanceReviewTemplate, Integer> {
}

