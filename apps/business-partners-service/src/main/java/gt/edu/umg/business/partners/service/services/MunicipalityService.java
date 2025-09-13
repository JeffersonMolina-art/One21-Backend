package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.MunicipalityDto;
import gt.edu.umg.business.partners.service.entities.Municipality;
import gt.edu.umg.business.partners.service.repositories.MunicipalityRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class MunicipalityService extends GenericServiceImpl<MunicipalityDto, Municipality, Integer> {

    private final MunicipalityRepository municipalityRepository;
    private final GenericMapper mapper;

    public MunicipalityService(MunicipalityRepository  typeRepository, GenericMapper mapper) {
        super(typeRepository, mapper, MunicipalityDto.class, Municipality.class);
        this.municipalityRepository = typeRepository;
        this.mapper = mapper;
    }
}
