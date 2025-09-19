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
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "employee_number", nullable = false, length = 20)
    private String employeeNumber;

    @NotNull
    @Column(name = "business_partner_id", nullable = false)
    private Integer businessPartnerId;

    @NotNull
    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_department_id")
    private EmployeeDepartment employeeDepartment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;

    @Size(max = 120)
    @Column(name = "position_title", length = 120)
    private String positionTitle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_employee_id")
    private Employee managerEmployee;

    @NotNull
    @ColumnDefault("'ACTIVE'")
    @Lob
    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "base_salary", precision = 12, scale = 2)
    private BigDecimal baseSalary;

    @Size(max = 3)
    @ColumnDefault("'GTQ'")
    @Column(name = "currency_code", length = 3)
    private String currencyCode;

    @Size(max = 64)
    @Column(name = "keycloak_user_id", length = 64)
    private String keycloakUserId;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}