package gt.edu.umg.ticket.service.controllers;

import gt.edu.umg.generic.data.controllers.GenericController;
import gt.edu.umg.ticket.service.dtos.TicketPriorityDto;
import gt.edu.umg.ticket.service.entities.TicketPriority;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("priorities")
public class TicketPriorityController extends GenericController<TicketPriorityDto, TicketPriority, Integer> {
    public TicketPriorityController(gt.edu.umg.ticket.service.services.TicketPriorityService ticketPriorityService) {
        super(ticketPriorityService);
    }
}
