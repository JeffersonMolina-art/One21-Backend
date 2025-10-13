package gt.edu.umg.business.partners.service.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * DTO for Partner Registration
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartnerRegistrationDto implements Serializable {

    // Datos básicos del Partner
    @NotNull(message = "El código es requerido")
    @Size(max = 20, message = "El código no puede exceder 20 caracteres")
    private String code;

    @NotNull(message = "El nombre es requerido")
    @Size(max = 200, message = "El nombre no puede exceder 200 caracteres")
    private String name;

    @Size(max = 50, message = "El NIT no puede exceder 50 caracteres")
    private String taxId;

    @Email(message = "El email debe ser válido")
    @Size(max = 100, message = "El email no puede exceder 100 caracteres")
    private String email;

    private String notes;

    // Lista de contactos
    private List<ContactRegistrationDto> contacts;

    // Lista de direcciones
    private List<AddressRegistrationDto> addresses;

    /**
     * DTO simplificado para Contact en el registro
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ContactRegistrationDto implements Serializable {
        @NotNull(message = "El nombre es requerido")
        @Size(max = 100, message = "El nombre no puede exceder 100 caracteres")
        private String firstName;

        @NotNull(message = "El apellido es requerido")
        @Size(max = 100, message = "El apellido no puede exceder 100 caracteres")
        private String lastName;

        @Size(max = 20, message = "El teléfono no puede exceder 20 caracteres")
        private String phone;

        private LocalDate birthDate;
    }

    /**
     * DTO simplificado para Address en el registro
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AddressRegistrationDto implements Serializable {
        private String addressType; // BILLING, SHIPPING, etc.

        @NotNull(message = "La calle es requerida")
        @Size(max = 200, message = "La calle no puede exceder 200 caracteres")
        private String street;

        @Size(max = 200, message = "La calle 2 no puede exceder 200 caracteres")
        private String street2;

        @Size(max = 100, message = "La colonia no puede exceder 100 caracteres")
        private String neighborhood;

        @Size(max = 10, message = "El código postal no puede exceder 10 caracteres")
        private String postalCode;

        private Boolean isDefault; // Indica si es la dirección predeterminada

        @NotNull(message = "El ID del municipio es requerido")
        private Integer municipalityId;
    }
}
