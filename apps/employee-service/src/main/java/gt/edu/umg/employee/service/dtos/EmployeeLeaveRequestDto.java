package gt.edu.umg.employee.service.dtos;

import gt.edu.umg.employee.service.entities.LeaveType;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.EmployeeLeaveRequest}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeLeaveRequestDto implements Serializable {
    Integer id;
    EmployeeDto employee;
    LeaveType leaveType;
    LocalDate startDate;
    LocalDate endDate;
    Integer daysRequested;
    String reason;
    LocalDate requestDate;
    String status;
    Integer approvedBy;
    LocalDate approvedDate;
    String approvalComments;
    Integer createdBy;
    Instant createdAt;
    Instant updatedAt;
}