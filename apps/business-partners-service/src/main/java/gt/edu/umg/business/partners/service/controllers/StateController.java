package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.StateDto;
import gt.edu.umg.business.partners.service.entities.State;
import gt.edu.umg.business.partners.service.services.StateService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("business-partners/states/")
public class StateController extends GenericController<StateDto, State, Integer> {

    private final StateService stateService;

    public StateController(StateService stateService) {
        super(stateService);
        this.stateService = stateService;
    }
}
