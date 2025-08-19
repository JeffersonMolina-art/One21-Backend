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
@Table(name = "employee_education")
public class EmployeeEducation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @NotNull
    @Lob
    @Column(name = "education_level", nullable = false)
    private String educationLevel;

    @Size(max = 200)
    @NotNull
    @Column(name = "institution_name", nullable = false, length = 200)
    private String institutionName;

    @Size(max = 200)
    @Column(name = "degree_name", length = 200)
    private String degreeName;

    @Size(max = 200)
    @Column(name = "field_of_study", length = 200)
    private String fieldOfStudy;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "graduation_date")
    private LocalDate graduationDate;

    @ColumnDefault("0")
    @Column(name = "is_completed")
    private Boolean isCompleted;

    @ColumnDefault("0")
    @Column(name = "is_verified")
    private Boolean isVerified;

    @Column(name = "gpa", precision = 3, scale = 2)
    private BigDecimal gpa;

    @Size(max = 100)
    @Column(name = "honors", length = 100)
    private String honors;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}