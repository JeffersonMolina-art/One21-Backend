package gt.edu.umg.ticket.service.repositories;

import gt.edu.umg.ticket.service.entities.TicketAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface TicketActionRepository extends JpaRepository<TicketAction, Integer> {
}