package gt.edu.umg.business.partners.service.repositories;

import gt.edu.umg.business.partners.service.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    public List<Department> findDepartmentByCountry_Id(Integer id);
}