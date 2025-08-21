package gt.edu.umg.employee.service.dtos;


import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.JobPosition}
 */
@Value
public class JobPositionDto implements Serializable {
    Integer id;
    String code;
    String title;
    String description;
    DepartmentDto department;
    String level;
    BigDecimal minSalary;
    BigDecimal maxSalary;
    Boolean requiresDegree;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}