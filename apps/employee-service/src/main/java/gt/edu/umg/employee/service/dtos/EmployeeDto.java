package gt.edu.umg.employee.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.Employee}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDto implements Serializable {
    Integer id;
    String code;
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    Instant hireDate;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}

