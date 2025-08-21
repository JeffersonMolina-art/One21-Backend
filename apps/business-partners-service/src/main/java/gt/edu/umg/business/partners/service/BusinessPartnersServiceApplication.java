package gt.edu.umg.business.partners.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/** @author Kevin Borge
 * @since 2025-08-10
 * * Clase principal del servicio de Business Partners.
 * * Esta clase inicia la aplicación Spring Boot y configura el escaneo de componentes
 * * para los paquetes específicos relacionados con los socios comerciales y los datos genéricos.
 * * para la reusabilidad del código y la organización del proyecto.
 * **/
@ComponentScan (basePackages = {
        "gt.edu.umg.business.partners",
        "gt.edu.umg.generic.data"
        })
public class BusinessPartnersServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessPartnersServiceApplication.class, args);
    }
}
