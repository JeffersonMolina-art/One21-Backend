package gt.edu.umg.business.partners.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Partner}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 20)
    String code;
    @NotNull
    @Size(max = 200)
    String name;
    @Size(max = 50)
    String taxId;
    @Size(max = 100)
    String email;
    Boolean isActive;
    Boolean isCustomer;
    Boolean isVendor;
    Boolean isEmployee;
    String notes;
    Integer createdBy;
    Integer updatedBy;
    Instant createdAt;
    Instant updatedAt;
}