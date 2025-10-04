package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.PartnerDto;
import gt.edu.umg.business.partners.service.entities.Partner;
import gt.edu.umg.business.partners.service.services.PartnerService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("partners")
public class PartnerController extends GenericController<PartnerDto, Partner, Integer> {

    private PartnerService partnerService;

    public PartnerController(PartnerService partnerService) {
        super(partnerService);
        this.partnerService = partnerService;
    }

    @GetMapping("/by-email/{email}")
    public List<PartnerDto> findByEmail(@PathVariable String email) {
        return this.partnerService.findByEmail(email);
    }
}
