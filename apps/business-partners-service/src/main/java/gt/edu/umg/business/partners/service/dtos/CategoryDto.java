package gt.edu.umg.business.partners.service.dtos;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Category}
 */
@Value
public class CategoryDto implements Serializable {
    Integer id;
    String code;
    String name;
    String description;
    BigDecimal discountPercentage;
    BigDecimal creditLimit;
    Integer paymentTermsDays;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}