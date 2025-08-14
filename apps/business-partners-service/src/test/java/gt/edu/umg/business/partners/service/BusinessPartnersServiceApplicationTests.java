package gt.edu.umg.business.partners.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@Slf4j
@SpringBootTest
@ActiveProfiles("test")
class BusinessPartnersServiceApplicationTests {

    @Test
    void contextLoads() {
        log.info("Context loads for business partners test executed successfully.");

    }

}
