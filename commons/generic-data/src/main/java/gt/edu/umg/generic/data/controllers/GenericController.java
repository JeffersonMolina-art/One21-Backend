package gt.edu.umg.generic.data.controllers;

import gt.edu.umg.generic.data.exceptions.MapperException;
import gt.edu.umg.generic.data.services.GenericService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class GenericController<D, T, ID> {

    protected final GenericService<D,T, ID> service;


    protected GenericController(GenericService<D,T, ID> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<D>> findAll() throws MapperException {
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/{id}")
    public D findById(@PathVariable ID id) throws MapperException {
        return service.findById(id);
    }

    @PostMapping
    public D create(@RequestBody D entity) throws MapperException {
        return service.save(entity);
    }

    @PutMapping
    public D update(@RequestBody D entity) throws MapperException {
        return service.update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) {
        service.deleteById(id);
    }
}
