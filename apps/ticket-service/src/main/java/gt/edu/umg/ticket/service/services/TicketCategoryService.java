package gt.edu.umg.ticket.service.services;


import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import gt.edu.umg.ticket.service.dtos.TicketCategoryDto;
import gt.edu.umg.ticket.service.entities.TicketCategory;
import gt.edu.umg.ticket.service.repositories.TicketCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TicketCategoryService extends GenericServiceImpl<TicketCategoryDto, TicketCategory, Integer> {
    private final TicketCategoryRepository ticketCategoryRepository;
    private final GenericMapper mapper;

    public TicketCategoryService(TicketCategoryRepository ticketCategoryRepository, GenericMapper mapper) {
        super(ticketCategoryRepository, mapper, TicketCategoryDto.class, TicketCategory.class);
        this.ticketCategoryRepository = ticketCategoryRepository;
        this.mapper = mapper;
    }
}
