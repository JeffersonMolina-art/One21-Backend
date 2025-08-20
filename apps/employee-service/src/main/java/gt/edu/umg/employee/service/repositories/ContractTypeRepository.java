package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.entities.ContractType;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ContractTypeRepository extends JpaRepository<ContractType, Integer> {
}
