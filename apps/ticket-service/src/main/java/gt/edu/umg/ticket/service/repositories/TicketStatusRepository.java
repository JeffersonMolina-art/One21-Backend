package gt.edu.umg.ticket.service.repositories;

import gt.edu.umg.ticket.service.entities.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface TicketStatusRepository extends JpaRepository<TicketStatus, Integer> {
}