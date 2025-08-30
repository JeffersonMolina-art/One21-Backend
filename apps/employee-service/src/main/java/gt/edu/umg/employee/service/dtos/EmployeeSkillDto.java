package gt.edu.umg.employee.service.dtos;

import gt.edu.umg.employee.service.entities.Skill;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.EmployeeSkill}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeSkillDto implements Serializable {
    Integer id;
    EmployeeDto employee;
    Skill skill;
    String proficiencyLevel;
    Integer proficiencyScore;
    Integer yearsExperience;
    String certificationName;
    LocalDate certificationDate;
    LocalDate certificationExpiry;
    Boolean isVerified;
    Integer verifiedBy;
    LocalDate verifiedDate;
    Instant createdAt;
    Instant updatedAt;
}