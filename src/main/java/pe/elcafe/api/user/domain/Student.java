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
public class Student extends UserAccount {
    @NotBlank
    @Size(min = 7, max = 15)
    @Column(unique = true, nullable = false, length = 15)
    private String studentCode;

    public Student(String studentCode, String password, String firstName, String middleName, String lastName, String email, String phone) {
        super.setUsername(studentCode);
        super.setPassword(password);
        super.setFirstName(firstName);
        super.setMiddleName(middleName);
        super.setLastName(lastName);
        super.setEmail(email);
        super.setPhone(phone);
        super.setRole(Role.USER);
        this.studentCode = studentCode;
    }
}
