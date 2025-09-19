package gt.edu.umg.ticket.service.services;

import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import gt.edu.umg.ticket.service.dtos.TicketAttachmentDto;
import gt.edu.umg.ticket.service.entities.TicketAttachment;
import gt.edu.umg.ticket.service.repositories.TicketAttachmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TicketAttachmentService extends GenericServiceImpl<TicketAttachmentDto, TicketAttachment, Integer> {
    private final  TicketAttachmentRepository ticketAttachmentRepository;
    private final GenericMapper mapper;

    public TicketAttachmentService(TicketAttachmentRepository ticketAttachmentRepository, GenericMapper mapper) {
        super(ticketAttachmentRepository, mapper, TicketAttachmentDto.class, TicketAttachment.class);
        this.ticketAttachmentRepository = ticketAttachmentRepository;
        this.mapper = mapper;
    }
}
