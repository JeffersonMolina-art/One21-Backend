package gt.edu.umg.employee.service.dtos;


import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.PerformanceReviewTemplate}
 */
@Value
public class PerformanceReviewTemplateDto implements Serializable {
    Integer id;
    String name;
    String description;
    String frequency;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}