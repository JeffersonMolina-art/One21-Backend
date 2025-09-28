package gt.edu.umg.ticket.service.repositories;

import gt.edu.umg.ticket.service.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}