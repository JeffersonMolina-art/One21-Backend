package gt.edu.umg.customer.service.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "customer_number", nullable = false, length = 20)
    private String customerNumber;

    @NotNull
    @Column(name = "business_partner_id", nullable = false)
    private Integer businessPartnerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private CustomerGroup group;

    @NotNull
    @ColumnDefault("'ACTIVE'")
    @Lob
    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "default_contact_id")
    private Integer defaultContactId;

    @Size(max = 120)
    @Column(name = "default_contact_name", length = 120)
    private String defaultContactName;

    @Size(max = 120)
    @Column(name = "default_contact_email", length = 120)
    private String defaultContactEmail;

    @Size(max = 30)
    @Column(name = "default_contact_phone", length = 30)
    private String defaultContactPhone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_term_id")
    private PaymentTerm paymentTerm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "price_list_id")
    private PriceList priceList;

    @Column(name = "credit_limit", precision = 12, scale = 2)
    private BigDecimal creditLimit;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "credit_blocked", nullable = false)
    private Boolean creditBlocked = false;

    @NotNull
    @ColumnDefault("0.00")
    @Column(name = "current_balance", nullable = false, precision = 12, scale = 2)
    private BigDecimal currentBalance;

    @NotNull
    @ColumnDefault("0")
    @Column(name = "tax_exempt", nullable = false)
    private Boolean taxExempt = false;

    @Size(max = 30)
    @Column(name = "tax_exemption_number", length = 30)
    private String taxExemptionNumber;

    @Column(name = "sales_rep_employee_id")
    private Integer salesRepEmployeeId;

    @Lob
    @Column(name = "notes")
    private String notes;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}