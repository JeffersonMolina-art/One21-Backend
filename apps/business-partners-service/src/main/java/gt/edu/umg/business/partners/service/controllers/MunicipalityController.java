package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.MunicipalityDto;
import gt.edu.umg.business.partners.service.dtos.PartnerDto;
import gt.edu.umg.business.partners.service.entities.Municipality;
import gt.edu.umg.business.partners.service.entities.Partner;
import gt.edu.umg.business.partners.service.services.MunicipalityService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("municipalities")
public class MunicipalityController  extends GenericController<MunicipalityDto, Municipality, Integer> {

    private final MunicipalityService municipalityService;

    public MunicipalityController(MunicipalityService municipalityService) {
        super(municipalityService);
        this.municipalityService = municipalityService;
    }

    @GetMapping("/by-department/{id}")
    public List<MunicipalityDto> findByDepartment(@PathVariable Integer id) {
        return municipalityService.findByMunicipalitiesForDeoarment(id);
    }
}
