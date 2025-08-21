package gt.edu.umg.business.partners.service.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Type}
 */
@Value
public class TypeDto implements Serializable {
    Integer id;
    String code;
    String name;
    String description;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}