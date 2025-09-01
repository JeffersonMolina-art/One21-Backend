package gt.edu.umg.employee.service.dtos;


import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.PayrollType}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PayrollTypeDto implements Serializable {
    Integer id;
    String code;
    String name;
    String frequency;
    String description;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}