package gt.edu.umg.employee.service.entities;

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
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "employee_contracts")
public class EmployeeContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Size(max = 40)
    @Column(name = "contract_number", length = 40)
    private String contractNumber;

    @NotNull
    @ColumnDefault("'INDEFINITE'")
    @Lob
    @Column(name = "contract_type", nullable = false)
    private String contractType;

    @NotNull
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @NotNull
    @ColumnDefault("'MONTHLY'")
    @Lob
    @Column(name = "pay_cycle", nullable = false)
    private String payCycle;

    @Column(name = "salary_amount", precision = 12, scale = 2)
    private BigDecimal salaryAmount;

    @Size(max = 3)
    @ColumnDefault("'GTQ'")
    @Column(name = "currency_code", length = 3)
    private String currencyCode;

    @Column(name = "hours_per_week", precision = 5, scale = 2)
    private BigDecimal hoursPerWeek;

    @NotNull
    @ColumnDefault("1")
    @Column(name = "is_active", nullable = false)
    private Boolean isActive = false;

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