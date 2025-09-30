package gt.edu.umg.ticket.service.services;

import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import gt.edu.umg.ticket.service.dtos.TicketDto;
import gt.edu.umg.ticket.service.entities.Ticket;
import gt.edu.umg.ticket.service.repositories.TicketRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TicketService extends GenericServiceImpl<TicketDto, Ticket, Integer> {
    private final TicketRepository ticketRepository;
    private final GenericMapper mapper;

    public TicketService(TicketRepository ticketRepository, GenericMapper mapper) {
        super(ticketRepository, mapper, TicketDto.class, Ticket.class);
        this.ticketRepository = ticketRepository;
        this.mapper = mapper;
    }

    public List<TicketDto> findByStatus(Integer statusId) {
        List<Ticket> tickets = ticketRepository.findByStatus_Id(statusId);
        return mapper.toDtoList(tickets , TicketDto.class);
    }
}
