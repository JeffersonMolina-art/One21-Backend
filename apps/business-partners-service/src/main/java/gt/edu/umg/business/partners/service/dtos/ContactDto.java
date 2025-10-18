package gt.edu.umg.business.partners.service.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Contact}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 100)
    String firstName;
    @NotNull
    @Size(max = 100)
    String lastName;
    @Size(max = 20)
    String phone;
    Boolean isActive;
    LocalDate birthDate;
    Instant createdAt;
    Instant updatedAt;
    @NotNull
    PartnerDto businessPartner;
}