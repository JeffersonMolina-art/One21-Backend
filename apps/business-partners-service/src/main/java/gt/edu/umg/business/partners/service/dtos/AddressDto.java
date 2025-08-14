package gt.edu.umg.business.partners.service.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Address}
 */
@Value
public class AddressDto implements Serializable {
    Integer id;
    PartnerDto businessPartner;
    String addressType;
    String street;
    String street2;
    String neighborhood;
    String postalCode;
    CityDto city;
    StateDto state;
    CountryDto country;
    Boolean isDefault;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}