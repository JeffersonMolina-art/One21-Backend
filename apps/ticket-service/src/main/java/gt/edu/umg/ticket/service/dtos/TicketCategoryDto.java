package gt.edu.umg.ticket.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.ticket.service.entities.TicketCategory}
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketCategoryDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 20)
    String code;
    @NotNull
    @Size(max = 100)
    String name;
    String description;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}