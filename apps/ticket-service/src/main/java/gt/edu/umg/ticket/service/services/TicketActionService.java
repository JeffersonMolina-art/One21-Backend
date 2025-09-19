package gt.edu.umg.ticket.service.services;

import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import gt.edu.umg.ticket.service.dtos.TicketActionDto;
import gt.edu.umg.ticket.service.entities.TicketAction;
import gt.edu.umg.ticket.service.repositories.TicketActionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TicketActionService extends GenericServiceImpl<TicketActionDto, TicketAction, Integer> {
    private final TicketActionRepository ticketActionRepository;
    private final GenericMapper mapper;

    public TicketActionService(TicketActionRepository ticketActionRepository, GenericMapper mapper) {
        super(ticketActionRepository, mapper, TicketActionDto.class, TicketAction.class);
        this.ticketActionRepository = ticketActionRepository;
        this.mapper = mapper;
    }
}
