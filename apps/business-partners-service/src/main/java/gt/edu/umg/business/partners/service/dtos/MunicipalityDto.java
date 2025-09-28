package gt.edu.umg.business.partners.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Municipality}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MunicipalityDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 100)
    String name;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
    @NotNull
    DepartmentDto departments;
}