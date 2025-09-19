package gt.edu.umg.ticket.service.controllers;

import gt.edu.umg.generic.data.controllers.GenericController;
import gt.edu.umg.ticket.service.dtos.TicketDto;
import gt.edu.umg.ticket.service.entities.Ticket;
import gt.edu.umg.ticket.service.services.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tickets")
public class TicketController extends GenericController<TicketDto, Ticket, Integer> {
    public TicketController(TicketService ticketService) {
        super(ticketService);
    }
}
