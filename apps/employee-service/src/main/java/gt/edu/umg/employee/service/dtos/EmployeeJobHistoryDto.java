package gt.edu.umg.employee.service.dtos;

import gt.edu.umg.employee.service.entities.JobPosition;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.EmployeeJobHistory}
 */
@Value
public class EmployeeJobHistoryDto implements Serializable {
    Integer id;
    EmployeeDto employee;
    LocalDate changeDate;
    String changeType;
    DepartmentDto previousDepartment;
    JobPosition previousJobPosition;
    BigDecimal previousSalary;
    Integer previousManagerId;
    DepartmentDto newDepartment;
    JobPosition newJobPosition;
    BigDecimal newSalary;
    Integer newManagerId;
    String reason;
    String comments;
    LocalDate effectiveDate;
    Integer createdBy;
    Instant createdAt;
}