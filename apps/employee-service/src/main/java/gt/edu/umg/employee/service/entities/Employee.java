package gt.edu.umg.employee.service.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "business_partner_id", nullable = false)
    private Integer businessPartnerId;

    @Size(max = 20)
    @NotNull
    @Column(name = "employee_number", nullable = false, length = 20)
    private String employeeNumber;

    @NotNull
    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @NotNull
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "job_position_id", nullable = false)
    private JobPosition jobPosition;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "reports_to_employee_id")
    private Employee reportsToEmployee;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "contract_type_id", nullable = false)
    private ContractType contractType;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "payroll_type_id", nullable = false)
    private PayrollType payrollType;

    @NotNull
    @Column(name = "base_salary", nullable = false, precision = 12, scale = 2)
    private BigDecimal baseSalary;

    @Size(max = 3)
    @ColumnDefault("'MXN'")
    @Column(name = "currency_code", length = 3)
    private String currencyCode;

    @Size(max = 100)
    @Column(name = "work_schedule", length = 100)
    private String workSchedule;

    @Size(max = 200)
    @Column(name = "work_location", length = 200)
    private String workLocation;

    @ColumnDefault("0")
    @Column(name = "is_remote")
    private Boolean isRemote;

    @ColumnDefault("'ACTIVE'")
    @Lob
    @Column(name = "employment_status")
    private String employmentStatus;

    @ColumnDefault("1")
    @Column(name = "is_eligible_overtime")
    private Boolean isEligibleOvertime;

    @ColumnDefault("1")
    @Column(name = "is_probation")
    private Boolean isProbation;

    @Column(name = "probation_end_date")
    private LocalDate probationEndDate;

    @Size(max = 200)
    @Column(name = "emergency_contact_name", length = 200)
    private String emergencyContactName;

    @Size(max = 20)
    @Column(name = "emergency_contact_phone", length = 20)
    private String emergencyContactPhone;

    @Size(max = 50)
    @Column(name = "emergency_contact_relationship", length = 50)
    private String emergencyContactRelationship;

    @Lob
    @Column(name = "notes")
    private String notes;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "updated_by")
    private Integer updatedBy;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}