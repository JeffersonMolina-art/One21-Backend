package gt.edu.umg.customer.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.customer.service.entities.PriceList}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceListDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 20)
    String code;
    @NotNull
    @Size(max = 120)
    String name;
    @NotNull
    @Size(max = 3)
    String currencyCode;
    @Size(max = 255)
    String description;
    @NotNull
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}