package gt.edu.umg.business.partners.service.dtos;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

/**
 * DTO for {@link gt.edu.umg.business.partners.service.entities.Partner}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerDto implements Serializable {
    Integer id;
    String code;
    String name;
    String commercialName;
    TypeDto type;
    CategoryDto category;
    String taxId;
    String legalForm;
    String email;
    String phone;
    String website;
    BigDecimal creditLimit;
    Integer paymentTermsDays;
    BigDecimal discountPercentage;
    String bankName;
    String bankAccount;
    Boolean isActive;
    Boolean isCustomer;
    Boolean isVendor;
    Boolean isEmployee;
    LocalDate registrationDate;
    LocalDate lastTransactionDate;
    String notes;
    Integer createdBy;
    Integer updatedBy;
    Instant createdAt;
    Instant updatedAt;
}