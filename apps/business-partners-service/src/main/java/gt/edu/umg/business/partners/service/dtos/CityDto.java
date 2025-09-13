package gt.edu.umg.business.partners.service.dtos;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.City}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityDto implements Serializable {
    Integer id;
    StateDto state;
    String name;
    String postalCode;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}