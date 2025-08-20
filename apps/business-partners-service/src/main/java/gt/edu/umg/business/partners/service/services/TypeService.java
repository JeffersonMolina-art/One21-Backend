package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.TypeDto;
import gt.edu.umg.business.partners.service.entities.Type;
import gt.edu.umg.business.partners.service.repositories.TypeRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class TypeService extends GenericServiceImpl<TypeDto, Type, Integer> {

    private final TypeRepository typeRepository;
    private final GenericMapper mapper;

    public TypeService(TypeRepository typeRepository, GenericMapper mapper) {
        super(typeRepository, mapper, TypeDto.class, Type.class);
        this.typeRepository = typeRepository;
        this.mapper = mapper;
    }
}
