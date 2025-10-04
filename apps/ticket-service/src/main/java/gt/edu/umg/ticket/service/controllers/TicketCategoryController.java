package gt.edu.umg.ticket.service.controllers;

import gt.edu.umg.generic.data.controllers.GenericController;
import gt.edu.umg.ticket.service.dtos.TicketCategoryDto;
import gt.edu.umg.ticket.service.entities.TicketCategory;
import gt.edu.umg.ticket.service.services.TicketCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class TicketCategoryController extends GenericController<TicketCategoryDto, TicketCategory, Integer> {
    public TicketCategoryController(TicketCategoryService ticketCategoryService) {
        super(ticketCategoryService);
    }
}
