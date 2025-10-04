package gt.edu.umg.ticket.service.controllers;

import gt.edu.umg.generic.data.controllers.GenericController;
import gt.edu.umg.ticket.service.dtos.TicketActionDto;
import gt.edu.umg.ticket.service.entities.TicketAction;
import gt.edu.umg.ticket.service.services.TicketActionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("actions")
public class TicketActionController extends GenericController<TicketActionDto, TicketAction, Integer> {
    public TicketActionController(TicketActionService ticketActionService) {
        super(ticketActionService);
    }
}
