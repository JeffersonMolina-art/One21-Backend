package gt.edu.umg.employee.service.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link gt.edu.umg.employee.service.entities.ContractType}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ContractTypeDto implements Serializable {
    Integer id;
    String code;
    String name;
    String description;
    Boolean isIndefinite;
    Integer defaultDurationMonths;
    Boolean benefitsEligible;
    Boolean isActive;
    Instant createdAt;
    Instant updatedAt;


}