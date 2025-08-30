package gt.edu.umg.employee.service.dtos;


import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.Skill}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SkillDto implements Serializable {
    Integer id;
    String code;
    String name;
    String category;
    String description;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}