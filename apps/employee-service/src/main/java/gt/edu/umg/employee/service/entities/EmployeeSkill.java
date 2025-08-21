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

import java.time.Instant;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee_skills")
public class EmployeeSkill {
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
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @NotNull
    @Lob
    @Column(name = "proficiency_level", nullable = false)
    private String proficiencyLevel;

    @Column(name = "proficiency_score")
    private Integer proficiencyScore;

    @Column(name = "years_experience")
    private Integer yearsExperience;

    @Size(max = 200)
    @Column(name = "certification_name", length = 200)
    private String certificationName;

    @Column(name = "certification_date")
    private LocalDate certificationDate;

    @Column(name = "certification_expiry")
    private LocalDate certificationExpiry;

    @ColumnDefault("0")
    @Column(name = "is_verified")
    private Boolean isVerified;

    @Column(name = "verified_by")
    private Integer verifiedBy;

    @Column(name = "verified_date")
    private LocalDate verifiedDate;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}