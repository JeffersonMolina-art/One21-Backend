package gt.edu.umg.ticket.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.ticket.service.entities.TicketPriority}
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketPriorityDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 20)
    String code;
    @NotNull
    @Size(max = 50)
    String name;
    @NotNull
    Integer level;
    Integer slaHours;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}