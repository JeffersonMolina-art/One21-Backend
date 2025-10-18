package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.CountryDto;
import gt.edu.umg.business.partners.service.entities.Country;
import gt.edu.umg.business.partners.service.services.CountryService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("countries")
public class CountryController extends GenericController<CountryDto, Country, Integer> {

    private CountryService countryService;

    public CountryController(CountryService countryService) {
        super(countryService);
        this.countryService = countryService;
    }
}
