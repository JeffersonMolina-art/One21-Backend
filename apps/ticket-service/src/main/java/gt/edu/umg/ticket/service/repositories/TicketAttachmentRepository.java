package gt.edu.umg.ticket.service.repositories;

import gt.edu.umg.ticket.service.entities.TicketAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface TicketAttachmentRepository extends JpaRepository<TicketAttachment, Integer> {
}