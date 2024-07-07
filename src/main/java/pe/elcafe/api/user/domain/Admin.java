package pe.elcafe.api.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Admin extends UserAccount {
    @Column(nullable = false)
    private Boolean isSuperAdmin = Boolean.FALSE;

    public Admin(String adminCode, String password, String names, String paternalSurname, String maternalSurname, String dni, String email, String phone, Boolean isSuperAdmin) {
        super.setUsername(adminCode);
        super.setPassword(password);
        super.setNames(names);
        super.setPaternalSurname(paternalSurname);
        super.setMaternalSurname(maternalSurname);
        super.setDni(dni);
        super.setEmail(email);
        super.setPhone(phone);
        super.setRole(Role.ADMIN);
        this.isSuperAdmin = isSuperAdmin;
    }
}
