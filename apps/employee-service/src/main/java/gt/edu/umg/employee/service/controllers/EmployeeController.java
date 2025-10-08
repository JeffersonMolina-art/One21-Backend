package gt.edu.umg.employee.service.controllers;

import gt.edu.umg.employee.service.dtos.EmployeeDto;
import gt.edu.umg.employee.service.entities.Employee;
import gt.edu.umg.employee.service.services.EmployeeService;
import gt.edu.umg.generic.data.controllers.GenericController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("employees")
public class EmployeeController extends GenericController<EmployeeDto, Employee, Integer> {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super(employeeService);
        this.employeeService = employeeService;
    }


    @Override
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> findAll() {
        return ResponseEntity.ok(employeeService.listFlat());
    }


    @PatchMapping("/{id}/status")
    public ResponseEntity<EmployeeDto> updateStatus(
            @PathVariable Integer id,
            @RequestBody Map<String, String> body
    ) {
        String newStatus = body.get("status");
        EmployeeDto employee = employeeService.findById(id);

        if (employee == null) {
            return ResponseEntity.notFound().build();
        }

        employee.setStatus(newStatus);
        EmployeeDto updated = employeeService.update(employee);

        return ResponseEntity.ok(updated);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateEmployee(
            @PathVariable Integer id,
            @RequestBody EmployeeDto dto
    ) {
        try {
            EmployeeDto employee = employeeService.findById(id);
            if (employee == null) {
                return ResponseEntity.notFound().build();
            }


            if (dto.getEmployeeNumber() != null) employee.setEmployeeNumber(dto.getEmployeeNumber());
            if (dto.getHireDate() != null) employee.setHireDate(dto.getHireDate());
            if (dto.getJobPositionId() != null) employee.setJobPositionId(dto.getJobPositionId());
            if (dto.getPositionTitle() != null) employee.setPositionTitle(dto.getPositionTitle());
            if (dto.getBaseSalary() != null) employee.setBaseSalary(dto.getBaseSalary());
            if (dto.getCurrencyCode() != null) employee.setCurrencyCode(dto.getCurrencyCode());
            if (dto.getStatus() != null) employee.setStatus(dto.getStatus());

            EmployeeDto updated = employeeService.update(employee);


            if (dto.getBusinessPartnerId() != null &&
                    (dto.getPartnerName() != null || dto.getPartnerEmail() != null || dto.getPartnerPhone() != null)) {

                RestTemplate restTemplate = new RestTemplate();
                String partnerServiceUrl = "http://localhost:8090/partners/" + dto.getBusinessPartnerId();

                Map<String, Object> partnerUpdate = new HashMap<>();
                if (dto.getPartnerName() != null) partnerUpdate.put("name", dto.getPartnerName());
                if (dto.getPartnerEmail() != null) partnerUpdate.put("email", dto.getPartnerEmail());
                if (dto.getPartnerPhone() != null) partnerUpdate.put("phone", dto.getPartnerPhone());

                restTemplate.put(partnerServiceUrl, partnerUpdate);
            }

            return ResponseEntity.ok(updated);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of(
                            "error", "Error al actualizar empleado",
                            "details", e.getMessage()
                    ));
        }
    }

    @GetMapping("/by-business-partner")
    public ResponseEntity<Employee> getByBusinessPartnerId(@RequestParam Integer businessPartnerId) {

        try {
            Employee employee = employeeService.findByBusinessPartnerId(businessPartnerId);
            if (employee == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(employee);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);

        }
    }
}

