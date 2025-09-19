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
 * DTO for {@link gt.edu.umg.ticket.service.entities.TicketAttachment}
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketAttachmentDto implements Serializable {
    Integer id;
    @NotNull
    TicketDto ticket;
    @NotNull
    @Size(max = 255)
    String fileName;
    @Size(max = 50)
    String fileType;
    Integer fileSize;
    @NotNull
    @Size(max = 500)
    String fileUrl;
    Integer uploadedByEmployeeId;
    Instant uploadedAt;
}