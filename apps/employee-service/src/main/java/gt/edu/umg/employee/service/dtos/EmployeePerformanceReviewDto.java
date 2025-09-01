package gt.edu.umg.employee.service.dtos;

import gt.edu.umg.employee.service.entities.PerformanceReviewTemplate;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.EmployeePerformanceReview}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeePerformanceReviewDto implements Serializable {
    Integer id;
    EmployeeDto employee;
    PerformanceReviewTemplate template;
    LocalDate reviewPeriodStart;
    LocalDate reviewPeriodEnd;
    LocalDate reviewDate;
    EmployeeDto reviewerEmployee;
    BigDecimal overallScore;
    BigDecimal technicalSkillsScore;
    BigDecimal softSkillsScore;
    BigDecimal goalsAchievementScore;
    String strengths;
    String areasForImprovement;
    String goalsNextPeriod;
    String employeeComments;
    String reviewerComments;
    String status;
    Instant createdAt;
    Instant updatedAt;
}