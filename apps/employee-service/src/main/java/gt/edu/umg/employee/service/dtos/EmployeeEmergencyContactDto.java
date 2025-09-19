package gt.edu.umg.employee.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.EmployeeEmergencyContact}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEmergencyContactDto implements Serializable {
    Integer id;
    @NotNull
    EmployeeDto employee;
    @NotNull
    @Size(max = 150)
    String name;
    @Size(max = 30)
    String phone;
    @Size(max = 60)
    String relationship;
    Instant createdAt;
}