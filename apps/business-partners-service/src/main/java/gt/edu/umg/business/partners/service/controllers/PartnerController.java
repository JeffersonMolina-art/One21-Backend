package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.PartnerDto;
import gt.edu.umg.business.partners.service.entities.Partner;
import gt.edu.umg.business.partners.service.services.PartnerService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PartnerController extends GenericController<PartnerDto, Partner, Integer> {

    private final PartnerService partnerService;

    public PartnerController(PartnerService partnerService) {
        super(partnerService);
        this.partnerService = partnerService;
    }
}
