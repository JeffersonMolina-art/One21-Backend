package gt.edu.umg.employee.service.dtos;


import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.Department}
 */
@Value
public class DepartmentDto implements Serializable {
    Integer id;
    String code;
    String name;
    String description;
    Integer managerEmployeeId;
    String costCenter;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}