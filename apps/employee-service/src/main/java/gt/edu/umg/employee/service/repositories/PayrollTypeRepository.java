package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.PayrollType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollTypeRepository extends JpaRepository<PayrollType, Integer> {
}

