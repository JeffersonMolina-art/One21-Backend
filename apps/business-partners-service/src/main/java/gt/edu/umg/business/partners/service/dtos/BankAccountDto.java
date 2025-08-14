package gt.edu.umg.business.partners.service.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.BankAccount}
 */
@Value
public class BankAccountDto implements Serializable {
    Integer id;
    PartnerDto businessPartner;
    String bankName;
    String bankCode;
    String accountNumber;
    String accountType;
    String swiftCode;
    String iban;
    String currencyCode;
    Boolean isDefault;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;
}