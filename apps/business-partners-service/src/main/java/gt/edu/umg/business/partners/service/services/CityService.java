package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.CityDto;
import gt.edu.umg.business.partners.service.entities.City;
import gt.edu.umg.business.partners.service.repositories.CityRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class CityService extends GenericServiceImpl<CityDto, City, Integer> {

    private final CityRepository cityRepository;
    private final GenericMapper mapper;

    public CityService(CityRepository cityRepository, GenericMapper mapper) {
        super(cityRepository, mapper,CityDto.class, City.class);
        this.cityRepository = cityRepository;
        this.mapper = mapper;
    }
}
