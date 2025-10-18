package gt.edu.umg.business.partners.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Country}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 3)
    String code;
    @NotNull
    @Size(max = 100)
    String name;
    @Size(max = 5)
    String phoneCode;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}