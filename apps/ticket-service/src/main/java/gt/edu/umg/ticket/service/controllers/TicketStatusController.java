package gt.edu.umg.ticket.service.controllers;

import gt.edu.umg.generic.data.controllers.GenericController;
import gt.edu.umg.ticket.service.dtos.TicketStatusDto;
import gt.edu.umg.ticket.service.entities.TicketStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ticket/statuses")
public class TicketStatusController extends GenericController<TicketStatusDto, TicketStatus, Integer> {
    public TicketStatusController(gt.edu.umg.ticket.service.services.TicketStatusService ticketStatusService) {
        super(ticketStatusService);
    }
}
