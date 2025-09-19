package gt.edu.umg.ticket.service.controllers;

import gt.edu.umg.generic.data.controllers.GenericController;
import gt.edu.umg.ticket.service.dtos.TicketAttachmentDto;
import gt.edu.umg.ticket.service.entities.TicketAttachment;
import gt.edu.umg.ticket.service.services.TicketAttachmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ticket/attachments")
public class TicketAttachmentController extends GenericController<TicketAttachmentDto, TicketAttachment, Integer> {
    public  TicketAttachmentController(TicketAttachmentService ticketAttachmentService) {
        super(ticketAttachmentService);
    }
}
