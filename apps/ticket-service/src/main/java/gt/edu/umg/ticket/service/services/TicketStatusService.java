package gt.edu.umg.ticket.service.services;

import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import gt.edu.umg.ticket.service.dtos.TicketStatusDto;
import gt.edu.umg.ticket.service.entities.TicketStatus;
import gt.edu.umg.ticket.service.repositories.TicketStatusRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TicketStatusService extends GenericServiceImpl<TicketStatusDto, TicketStatus, Integer> {
    private final TicketStatusRepository ticketStatusRepository;
    private final GenericMapper mapper;

    public TicketStatusService(TicketStatusRepository ticketStatusRepository, GenericMapper mapper) {
        super(ticketStatusRepository, mapper, TicketStatusDto.class, TicketStatus.class);
        this.ticketStatusRepository = ticketStatusRepository;
        this.mapper = mapper;
    }
}
