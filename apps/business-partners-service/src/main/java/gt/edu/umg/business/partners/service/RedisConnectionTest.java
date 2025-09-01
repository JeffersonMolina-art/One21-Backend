package gt.edu.umg.business.partners.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisConnectionTest implements CommandLineRunner {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public void run(String... args) throws Exception {
        try {
            // Prueba de escritura en Redis
            redisTemplate.opsForValue().set("testKey", "testValue");

            // Prueba de lectura desde Redis
            String value = redisTemplate.opsForValue().get("testKey");

            if ("testValue".equals(value)) {
                System.out.println("Conexión a Redis exitosa. Operación de prueba completada correctamente.");
            } else {
                System.err.println("Conexión a Redis fallida. No se pudo recuperar el valor esperado.");
            }
        } catch (Exception e) {
            System.err.println("Error al conectar con Redis: " + e.getMessage());
        }
    }
}
