package gt.edu.umg.ticket.service.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 30)
    @NotNull
    @Column(name = "ticket_number", nullable = false, length = 30)
    private String ticketNumber;

    @Size(max = 200)
    @NotNull
    @Column(name = "subject", nullable = false, length = 200)
    private String subject;

    @NotNull
    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private TicketCategory category;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "priority_id", nullable = false)
    private TicketPriority priority;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "status_id", nullable = false)
    private TicketStatus status;

    @NotNull
    @Column(name = "business_partner_id", nullable = false)
    private Integer businessPartnerId;

    @Column(name = "contact_id")
    private Integer contactId;

    @Size(max = 100)
    @Column(name = "contact_name", length = 100)
    private String contactName;

    @Size(max = 100)
    @Column(name = "contact_email", length = 100)
    private String contactEmail;

    @Size(max = 20)
    @Column(name = "contact_phone", length = 20)
    private String contactPhone;

    @Column(name = "created_by_employee_id")
    private Integer createdByEmployeeId;

    @Column(name = "assigned_to_employee_id")
    private Integer assignedToEmployeeId;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "opened_at")
    private Instant openedAt;

    @Column(name = "closed_at")
    private Instant closedAt;

    @Column(name = "sla_due_at")
    private Instant slaDueAt;

    @Lob
    @Column(name = "resolution_summary")
    private String resolutionSummary;

    @Column(name = "satisfaction_rating")
    private Integer satisfactionRating;

    @Lob
    @Column(name = "feedback")
    private String feedback;

    @ColumnDefault("0")
    @Column(name = "is_escalated")
    private Boolean isEscalated;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "parent_ticket_id")
    private Ticket parentTicket;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}