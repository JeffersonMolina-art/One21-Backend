package gt.edu.umg.employee.service.dtos;

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
 * DTO for {@link gt.edu.umg.employee.service.entities.EmployeeContract}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeContractDto implements Serializable {
    Integer id;
    @NotNull
    EmployeeDto employee;
    @Size(max = 40)
    String contractNumber;
    @NotNull
    String contractType;
    @NotNull
    LocalDate startDate;
    LocalDate endDate;
    @NotNull
    String payCycle;
    BigDecimal salaryAmount;
    @Size(max = 3)
    String currencyCode;
    BigDecimal hoursPerWeek;
    @NotNull
    Boolean isActive;
    String notes;
    Instant createdAt;
    Instant updatedAt;
}