package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.dtos.StateDto;
import gt.edu.umg.business.partners.service.entities.State;
import gt.edu.umg.business.partners.service.services.StateService;
import gt.edu.umg.generic.data.controllers.GenericController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("states/")
public class StateController extends GenericController<StateDto, State, Integer> {

    public StateController(StateService stateService) {
        super(stateService);
    }
}
