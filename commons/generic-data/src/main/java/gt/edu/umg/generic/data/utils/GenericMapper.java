package gt.edu.umg.generic.data.utils;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
public class GenericMapper {

    private final ModelMapper modelMapper;

    public GenericMapper() {
        this.modelMapper = new ModelMapper();
    }

    public <D, E> D toDto(E entity, Class<D> dtoClass) {
        return modelMapper.map(entity, dtoClass);
    }

    public <D, E> E toEntity(D dto, Class<E> entityClass) {
        if (entityClass == null) {
            throw new IllegalArgumentException("El parámetro entityClass no puede ser null. Verifica que lo estás pasando correctamente.");
        }
        log.info("DTO recibido: {}", dto);
        E entity = modelMapper.map(dto, entityClass);
        log.info("Entidad mapeada: {}", entity);
        return entity;
    }


    public <D, T> List<D> toDtoList(List<T> entityList, Class<D> dtoClass) {
        if (dtoClass == null) {
            throw new IllegalArgumentException("dtoClass no puede ser null. Verifica que lo pasas en el constructor.");
        }
        return entityList.stream()
                .map(entity -> modelMapper.map(entity, dtoClass))
                .collect(Collectors.toList());
    }
}