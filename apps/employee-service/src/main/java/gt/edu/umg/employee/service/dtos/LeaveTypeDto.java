package gt.edu.umg.employee.service.dtos;


import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.LeaveType}
 */
@Value
public class LeaveTypeDto implements Serializable {
    Integer id;
    String code;
    String name;
    String description;
    Boolean isPaid;
    Boolean requiresApproval;
    Integer maxDaysPerYear;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}