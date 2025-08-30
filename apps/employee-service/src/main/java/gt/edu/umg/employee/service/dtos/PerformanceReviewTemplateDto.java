package gt.edu.umg.employee.service.dtos;


import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.PerformanceReviewTemplate}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PerformanceReviewTemplateDto implements Serializable {
    Integer id;
    String name;
    String description;
    String frequency;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}