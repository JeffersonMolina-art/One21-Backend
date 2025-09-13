package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.MunicipalityDto;
import gt.edu.umg.business.partners.service.dtos.PartnerDto;
import gt.edu.umg.business.partners.service.entities.Municipality;
import gt.edu.umg.business.partners.service.entities.Partner;
import gt.edu.umg.business.partners.service.services.MunicipalityService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("partners/municipalities")
public class MunicipalityController  extends GenericController<MunicipalityDto, Municipality, Integer> {

    private final MunicipalityService municipalityService;

    public MunicipalityController(MunicipalityService municipalityService) {
        super(municipalityService);
        this.municipalityService = municipalityService;
    }
}
