package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.CountryDto;
import gt.edu.umg.business.partners.service.entities.Country;
import gt.edu.umg.business.partners.service.repositories.CountryRepository;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;


@Service
public class CountryService extends GenericServiceImpl<CountryDto, Country,Integer> {

    private CountryRepository countryRepository;
    private GenericMapper mapper;

    public CountryService(CountryRepository countryRepository, GenericMapper mapper) {
        super(countryRepository, mapper, CountryDto.class, Country.class);
        this.countryRepository = countryRepository;
        this.mapper = mapper;
    }
}
