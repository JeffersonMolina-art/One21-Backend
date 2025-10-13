package gt.edu.umg.ticket.service.repositories;

import gt.edu.umg.ticket.service.entities.Ticket;
import gt.edu.umg.ticket.service.entities.TicketStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    List<Ticket> findByStatus_Id(Integer statusId);

    List<Ticket> findByBusinessPartnerId(Integer partnerId);

    List<Ticket> findByBusinessPartnerIdAndStatus_Id(Integer businessPartnerId, Integer statusId);

    List<Ticket> findByAssignedToEmployeeIdAndStatus_Id(Integer employeeId, Integer status);

    List<Ticket> findByAssignedToEmployeeId(Integer employeeId);

}