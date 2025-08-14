package gt.edu.umg.generic.data.services;

import gt.edu.umg.generic.data.exceptions.MapperException;
import gt.edu.umg.generic.data.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Slf4j
public abstract class GenericServiceImpl<D, T, ID> implements GenericService<D, T, ID> {

    protected final JpaRepository<T, ID> repository;
    @Autowired
    private final GenericMapper mapper;
    private final Class<D> dtoClass;
    private final Class<T> entityClass;

    public GenericServiceImpl(JpaRepository<T, ID> repository, GenericMapper mapper, Class<D> dtoClass, Class<T> entityClass) {
        this.repository = repository;
        this.mapper = mapper;
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    @Override
    public List<D> findAll() throws MapperException {
        List<T> entities = repository.findAll();
//        if (entities == null || entities.isEmpty()) {
//            throw new MapperException("No se encontraron registros válidos en la base de datos");
//        }
        return mapper.toDtoList(entities, dtoClass);
    }

    @Override
    public D findById(ID id) throws MapperException {
        T entity = repository.findById(id).orElse(null);
        return entityNotNull(entity);
    }

    @Override
    public D save(D dto) throws MapperException {
        T entity = mapper.toEntity(dto, entityClass);
        T savedEntity = repository.save(entity);
        return entityNotNull(savedEntity);
    }

    @Override
    public D update(D dto) throws MapperException {
        T entityToUpdate = mapper.toEntity(dto, entityClass);
        T updatedEntity = repository.save(entityToUpdate);
        return entityNotNull(updatedEntity);
    }

    @Override
    public void deleteById(ID id) {
        boolean exists = repository.existsById(id);
        log.info("Entity is exists: {}", exists);
        repository.deleteById(id);
        if( !exists ) {
            log.warn("No se encontró la entidad con ID: {}", id);
            throw new MapperException("No se encontró la entidad con ID: " + id);
        } else {
            log.info("Entidad con ID: {} eliminada correctamente", id);
        }
    }

    private D entityNotNull(T entity) throws MapperException {
//        if (entity == null) {
//            throw new MapperException("No se encontraron registros válidos para la búsqueda");
//        }
        return mapper.toDto(entity, dtoClass);
    }
}