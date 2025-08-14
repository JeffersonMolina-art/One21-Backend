package gt.edu.umg.business.partners.service.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.State}
 */
@Value
public class StateDto implements Serializable {
    Integer id;
    CountryDto country;
    String code;
    String name;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}