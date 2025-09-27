package gt.edu.umg.customer.service.dtos;

import gt.edu.umg.customer.service.entities.CustomerGroup;
import gt.edu.umg.customer.service.entities.PaymentTerm;
import gt.edu.umg.customer.service.entities.PriceList;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.customer.service.entities.Customer}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 20)
    String customerNumber;
    @NotNull
    Integer businessPartnerId;
    CustomerGroup group;
    @NotNull
    String status;
    Integer defaultContactId;
    @Size(max = 120)
    String defaultContactName;
    @Size(max = 120)
    String defaultContactEmail;
    @Size(max = 30)
    String defaultContactPhone;
    PaymentTerm paymentTerm;
    PriceList priceList;
    BigDecimal creditLimit;
    @NotNull
    Boolean creditBlocked;
    @NotNull
    BigDecimal currentBalance;
    @NotNull
    Boolean taxExempt;
    @Size(max = 30)
    String taxExemptionNumber;
    Integer salesRepEmployeeId;
    String notes;
    Instant createdAt;
    Instant updatedAt;
}