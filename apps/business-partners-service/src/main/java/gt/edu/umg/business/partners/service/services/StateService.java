package gt.edu.umg.business.partners.service.services;

import gt.edu.umg.business.partners.service.dtos.StateDto;
import gt.edu.umg.business.partners.service.entities.State;
import gt.edu.umg.business.partners.service.repositories.StateRepository;
import gt.edu.umg.generic.data.services.GenericService;
import gt.edu.umg.generic.data.services.GenericServiceImpl;
import gt.edu.umg.generic.data.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class StateService extends GenericServiceImpl<StateDto, State, Integer> {
    private final StateRepository stateRepository;
    private final GenericMapper mapper;

    public  StateService(StateRepository stateRepository, GenericMapper mapper) {
        super(stateRepository, mapper, StateDto.class, State.class);
        this.stateRepository = stateRepository;
        this.mapper = mapper;
    }

}
