package gt.edu.umg.employee.service.dtos;

import gt.edu.umg.employee.service.entities.Employee;
import gt.edu.umg.employee.service.entities.EmployeeDepartment;
import gt.edu.umg.employee.service.entities.JobPosition;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.Employee}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 20)
    String employeeNumber;
    @NotNull
    Integer businessPartnerId;
    @NotNull
    LocalDate hireDate;
    EmployeeDepartment employeeDepartment;
    JobPosition jobPosition;
    @Size(max = 120)
    String positionTitle;
    Employee managerEmployee;
    @NotNull
    String status;
    BigDecimal baseSalary;
    @Size(max = 3)
    String currencyCode;
    @Size(max = 64)
    String keycloakUserId;
    Instant createdAt;
    Instant updatedAt;
}