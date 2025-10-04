package gt.edu.umg.ticket.service.controllers;

import gt.edu.umg.generic.data.controllers.GenericController;
import gt.edu.umg.ticket.service.dtos.TicketDto;
import gt.edu.umg.ticket.service.entities.Ticket;
import gt.edu.umg.ticket.service.services.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tickets")
public class TicketController extends GenericController<TicketDto, Ticket, Integer> {

    private TicketService ticketService;



    public TicketController(TicketService ticketService) {
        super(ticketService);
        this.ticketService = ticketService;
    }

    @GetMapping("/status/{status}")
    public List<TicketDto> findAllTickets(@PathVariable Integer status) {
        return ticketService.findByStatus(status);
    }

    @GetMapping("/by-partner/{id}")
    public List<TicketDto> findByPartnerId(Integer id) {
        return ticketService.findByPartnertId(id);
    }

    @GetMapping("/by-partner/{partnerId}/status/{status}")
    public  List<TicketDto> findByPartnerIdAndStatus(@PathVariable Integer partnerId, @PathVariable Integer status) {
        return ticketService.findByPartnerIdAndStatus(partnerId, status);
    }

    @GetMapping("/by-employee/{employeeId}/status/{status}")
    public  List<TicketDto> findByEmployeeIdAndStatus(@PathVariable Integer employeeId, @PathVariable Integer status) {
        return ticketService.findByEmployeeIdAndStatus(employeeId, status);
    }
}
