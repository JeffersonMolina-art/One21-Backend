package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.CityDto;
import gt.edu.umg.business.partners.service.entities.City;
import gt.edu.umg.business.partners.service.services.CityService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("partners/cities")
public class CityController extends GenericController<CityDto, City, Integer> {

    private final CityService cityService;

    public CityController(CityService cityService) {
        super(cityService);
        this.cityService = cityService;
    }
}
