package gt.edu.umg.business.partners.service.dtos;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.State}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateDto implements Serializable {
    Integer id;
    CountryDto country;
    String code;
    String name;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}