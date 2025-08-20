package gt.edu.umg.employee.service.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
@Table(name = "employee_performance_reviews")
public class EmployeePerformanceReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "template_id")
    private PerformanceReviewTemplate template;

    @NotNull
    @Column(name = "review_period_start", nullable = false)
    private LocalDate reviewPeriodStart;

    @NotNull
    @Column(name = "review_period_end", nullable = false)
    private LocalDate reviewPeriodEnd;

    @NotNull
    @Column(name = "review_date", nullable = false)
    private LocalDate reviewDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    @JoinColumn(name = "reviewer_employee_id")
    private Employee reviewerEmployee;

    @Column(name = "overall_score", precision = 3, scale = 1)
    private BigDecimal overallScore;

    @Column(name = "technical_skills_score", precision = 3, scale = 1)
    private BigDecimal technicalSkillsScore;

    @Column(name = "soft_skills_score", precision = 3, scale = 1)
    private BigDecimal softSkillsScore;

    @Column(name = "goals_achievement_score", precision = 3, scale = 1)
    private BigDecimal goalsAchievementScore;

    @Lob
    @Column(name = "strengths")
    private String strengths;

    @Lob
    @Column(name = "areas_for_improvement")
    private String areasForImprovement;

    @Lob
    @Column(name = "goals_next_period")
    private String goalsNextPeriod;

    @Lob
    @Column(name = "employee_comments")
    private String employeeComments;

    @Lob
    @Column(name = "reviewer_comments")
    private String reviewerComments;

    @ColumnDefault("'DRAFT'")
    @Lob
    @Column(name = "status")
    private String status;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "updated_at")
    private Instant updatedAt;

}