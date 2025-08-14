package gt.edu.umg.business.partners.service.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Country}
 */
@Value
public class CountryDto implements Serializable {
    Integer id;
    String code;
    String name;
    String phoneCode;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}