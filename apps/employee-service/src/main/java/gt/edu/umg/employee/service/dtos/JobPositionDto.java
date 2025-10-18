package gt.edu.umg.employee.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.JobPosition}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPositionDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 20)
    String code;
    @NotNull
    @Size(max = 120)
    String name;
    @Size(max = 255)
    String description;
    @NotNull
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}