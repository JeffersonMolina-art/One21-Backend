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
 * DTO for {@link gt.edu.umg.ticket.service.entities.Ticket}
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 30)
    String ticketNumber;
    @NotNull
    @Size(max = 200)
    String subject;
    @NotNull
    String description;
    @NotNull
    TicketCategoryDto category;
    @NotNull
    TicketPriorityDto priority;
    @NotNull
    TicketStatusDto status;
    @NotNull
    Integer businessPartnerId;
    Integer contactId;
    @Size(max = 100)
    String contactName;
    @Size(max = 100)
    String contactEmail;
    @Size(max = 20)
    String contactPhone;
    Integer createdByEmployeeId;
    Integer assignedToEmployeeId;
    Instant openedAt;
    Instant closedAt;
    Instant slaDueAt;
    String resolutionSummary;
    Integer satisfactionRating;
    String feedback;
    Boolean isEscalated;
    TicketDto parentTicket;
    Instant updatedAt;
}