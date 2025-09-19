package gt.edu.umg.employee.service.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "employee_emergency_contacts")
public class EmployeeEmergencyContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Size(max = 150)
    @NotNull
    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Size(max = 30)
    @Column(name = "phone", length = 30)
    private String phone;

    @Size(max = 60)
    @Column(name = "relationship", length = 60)
    private String relationship;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at")
    private Instant createdAt;

}