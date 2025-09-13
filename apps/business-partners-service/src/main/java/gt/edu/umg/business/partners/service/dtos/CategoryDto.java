package gt.edu.umg.business.partners.service.dtos;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Category}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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