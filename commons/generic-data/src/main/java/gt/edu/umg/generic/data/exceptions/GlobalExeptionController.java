package gt.edu.umg.generic.data.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public  class GlobalExeptionController {

    @ExceptionHandler(MapperException.class)
    public ResponseEntity<Map<String, Object>> handleMapperException(MapperException ex) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", "Error de mapeo");
        response.put("mensaje", ex.getMessage());
        response.put("timestamp", LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
