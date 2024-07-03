package pe.elcafe.api.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Admin extends UserAccount {
    @NotBlank
    @Size(min = 7, max = 15)
    @Column(unique = true, nullable = false, length = 15)
    private String adminCode;

    @Column(nullable = false)
    private Boolean isSuperAdmin = Boolean.FALSE;

    public Admin(String adminCode, String password, String firstName, String middleName, String lastName, String email, String phone, Boolean isSuperAdmin) {
        super.setUsername(adminCode);
        super.setPassword(password);
        super.setFirstName(firstName);
        super.setMiddleName(middleName);
        super.setLastName(lastName);
        super.setEmail(email);
        super.setPhone(phone);
        super.setRole(Role.ADMIN);
        this.adminCode = adminCode;
        this.isSuperAdmin = isSuperAdmin;
    }
}
