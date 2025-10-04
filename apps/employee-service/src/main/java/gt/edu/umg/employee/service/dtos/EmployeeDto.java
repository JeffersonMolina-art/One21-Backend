package gt.edu.umg.employee.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class EmployeeDto implements Serializable {

    private Integer id;

    @NotNull
    @Size(max = 20)
    private String employeeNumber;

    @NotNull
    private Integer businessPartnerId;

    @NotNull
    private LocalDate hireDate;

    private Integer employeeDepartmentId;
    private Integer jobPositionId;
    private String positionTitle;
    private Integer managerEmployeeId;

    private String partnerName;
    private String partnerEmail;
    private String partnerPhone;


    @NotNull
    private String status;

    private BigDecimal baseSalary;

    @Size(max = 3)
    private String currencyCode;

    @Size(max = 64)
    private String keycloakUserId;

    private Instant createdAt;
    private Instant updatedAt;


    public EmployeeDto(
            Integer id,
            String employeeNumber,
            Integer businessPartnerId,
            LocalDate hireDate,
            Integer employeeDepartmentId,
            Integer jobPositionId,
            String positionTitle,
            Integer managerEmployeeId,
            String status,
            BigDecimal baseSalary,
            String currencyCode,
            String keycloakUserId,
            Instant createdAt,
            Instant updatedAt
    ) {
        this.id = id;
        this.employeeNumber = employeeNumber;
        this.businessPartnerId = businessPartnerId;
        this.hireDate = hireDate;
        this.employeeDepartmentId = employeeDepartmentId;
        this.jobPositionId = jobPositionId;
        this.positionTitle = positionTitle;
        this.managerEmployeeId = managerEmployeeId;
        this.status = status;
        this.baseSalary = baseSalary;
        this.currencyCode = currencyCode;
        this.keycloakUserId = keycloakUserId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
