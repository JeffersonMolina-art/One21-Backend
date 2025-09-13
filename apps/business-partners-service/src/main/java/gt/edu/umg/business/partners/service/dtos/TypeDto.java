package gt.edu.umg.business.partners.service.dtos;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Type}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeDto implements Serializable {
    Integer id;
    String code;
    String name;
    String description;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}