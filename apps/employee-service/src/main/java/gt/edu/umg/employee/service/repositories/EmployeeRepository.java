package gt.edu.umg.employee.service.repositories;

import gt.edu.umg.employee.service.dtos.EmployeeDto;
import gt.edu.umg.employee.service.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("""
        select new gt.edu.umg.employee.service.dtos.EmployeeDto(
            e.id,
            e.employeeNumber,
            e.businessPartnerId,
            e.hireDate,
            ed.id,
            jp.id,
            e.positionTitle,
            m.id,
            e.status,
            e.baseSalary,
            e.currencyCode,
            e.keycloakUserId,
            e.createdAt,
            e.updatedAt
        )
        from Employee e
        left join e.employeeDepartment ed
        left join e.jobPosition jp
        left join e.managerEmployee m
        order by e.id
    """)
    List<EmployeeDto> findAllFlat();

    Employee findEmployeeByBusinessPartnerId(Integer businessPartnerId);

}
