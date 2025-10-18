package gt.edu.umg.ticket.service.services;

import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import gt.edu.umg.ticket.service.dtos.TicketPriorityDto;
import gt.edu.umg.ticket.service.entities.TicketPriority;
import gt.edu.umg.ticket.service.repositories.TicketPriorityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TicketPriorityService extends GenericServiceImpl<TicketPriorityDto, TicketPriority, Integer> {
    private final TicketPriorityRepository ticketPriorityRepository;
    private final GenericMapper mapper;

    public TicketPriorityService(TicketPriorityRepository ticketPriorityRepository, GenericMapper mapper) {
        super(ticketPriorityRepository, mapper, TicketPriorityDto.class, TicketPriority.class);
        this.ticketPriorityRepository = ticketPriorityRepository;
        this.mapper = mapper;
    }
}
