package gt.edu.umg.business.partners.service.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "bank_accounts", schema = "ERP-BUSSINES-PARTNERS")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "business_partner_id", nullable = false)
    private Partner businessPartner;

    @Column(name = "bank_name", nullable = false, length = 100)
    private String bankName;

    @Column(name = "bank_code", length = 20)
    private String bankCode;

    @Column(name = "account_number", nullable = false, length = 50)
    private String accountNumber;

    @ColumnDefault("'CHECKING'")
    @Lob
    @Column(name = "account_type")
    private String accountType;

    @Column(name = "swift_code", length = 20)
    private String swiftCode;

    @Column(name = "iban", length = 50)
    private String iban;

    @ColumnDefault("'QTZ'")
    @Column(name = "currency_code", length = 3)
    private String currencyCode;

    @ColumnDefault("0")
    @Column(name = "is_default")
    private Boolean isDefault;

    @ColumnDefault("1")
    @Column(name = "is_active")
    private Boolean isActive;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}