package gt.edu.umg.ticket.service.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.ticket.service.entities.TicketAction}
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketActionDto implements Serializable {
    Integer id;
    @NotNull
    TicketDto ticket;
    @NotNull
    String actionType;
    Integer performedByEmployeeId;
    Instant performedAt;
    String notes;
    TicketStatusDto previousStatus;
    TicketStatusDto newStatus;
}