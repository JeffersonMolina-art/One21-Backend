package gt.edu.umg.employee.service.dtos;

import gt.edu.umg.employee.service.entities.Employee;
import gt.edu.umg.employee.service.entities.JobPosition;
import gt.edu.umg.employee.service.entities.PayrollType;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.Employee}
 */
@Value
public class EmployeeDto implements Serializable {
    Integer id;
    Integer businessPartnerId;
    String employeeNumber;
    LocalDate hireDate;
    LocalDate startDate;
    LocalDate endDate;
    DepartmentDto department;
    JobPosition jobPosition;
    Employee reportsToEmployee;
    ContractTypeDto contractType;
    PayrollType payrollType;
    BigDecimal baseSalary;
    String currencyCode;
    String workSchedule;
    String workLocation;
    Boolean isRemote;
    String employmentStatus;
    Boolean isEligibleOvertime;
    Boolean isProbation;
    LocalDate probationEndDate;
    String emergencyContactName;
    String emergencyContactPhone;
    String emergencyContactRelationship;
    String notes;
    Integer createdBy;
    Integer updatedBy;
    Instant createdAt;
    Instant updatedAt;
}