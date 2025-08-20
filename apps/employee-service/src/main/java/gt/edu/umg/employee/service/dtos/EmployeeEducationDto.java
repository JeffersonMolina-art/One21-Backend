package gt.edu.umg.employee.service.dtos;


import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.EmployeeEducation}
 */
@Value
public class EmployeeEducationDto implements Serializable {
    Integer id;
    EmployeeDto employee;
    String educationLevel;
    String institutionName;
    String degreeName;
    String fieldOfStudy;
    LocalDate startDate;
    LocalDate endDate;
    LocalDate graduationDate;
    Boolean isCompleted;
    Boolean isVerified;
    BigDecimal gpa;
    String honors;
    Instant createdAt;
    Instant updatedAt;
}