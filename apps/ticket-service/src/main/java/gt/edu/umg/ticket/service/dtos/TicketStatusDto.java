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
 * DTO for {@link gt.edu.umg.ticket.service.entities.TicketStatus}
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketStatusDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 20)
    String code;
    @NotNull
    @Size(max = 50)
    String name;
    Boolean isFinal;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}