package gt.edu.umg.business.partners.service.dtos;

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
    PartnerDto businessPartner;
    String firstName;
    String lastName;
    String title;
    String position;
    String department;
    String email;
    String phone;
    String mobile;
    String extension;
    Boolean isMainContact;
    Boolean isActive;
    LocalDate birthDate;
    Instant createdAt;
    Instant updatedAt;
}