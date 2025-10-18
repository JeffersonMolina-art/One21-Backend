package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.PartnerDto;
import gt.edu.umg.business.partners.service.entities.Partner;
import gt.edu.umg.business.partners.service.repositories.PartnerRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerService extends GenericServiceImpl<PartnerDto, Partner, Integer> {

    private final PartnerRepository partnerRepository;
    private final GenericMapper mapper;

    public PartnerService(PartnerRepository partnerRepository, GenericMapper mapper) {
        super(partnerRepository, mapper, PartnerDto.class, Partner.class);
        this.partnerRepository = partnerRepository;
        this.mapper = mapper;
    }

    public List<PartnerDto> findByEmail(String email) {
        List<Partner> partners = partnerRepository.findPartnerByEmail(email);
        return mapper.toDtoList(partners , PartnerDto.class);
    }
}
