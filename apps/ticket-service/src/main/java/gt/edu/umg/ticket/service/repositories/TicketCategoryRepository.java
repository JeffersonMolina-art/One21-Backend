package gt.edu.umg.ticket.service.repositories;

import gt.edu.umg.ticket.service.entities.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
}