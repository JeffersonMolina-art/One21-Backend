package gt.edu.umg.business.partners.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Address}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto implements Serializable {
    Integer id;
    String addressType;
    @NotNull
    @Size(max = 200)
    String street;
    @Size(max = 200)
    String street2;
    @Size(max = 100)
    String neighborhood;
    @Size(max = 10)
    String postalCode;
    Boolean isDefault;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
    @NotNull
    PartnerDto businessPartner;
}