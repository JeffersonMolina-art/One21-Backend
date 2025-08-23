package gt.edu.umg.business.partners.service.controllers;

import gt.edu.umg.business.partners.service.services.TypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("types")
public class TypeController<TypeDto, Type, Integer> {

    private final TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }
}
