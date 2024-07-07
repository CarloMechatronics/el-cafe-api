package pe.elcafe.api.user.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import pe.elcafe.api.constraints.nullablesize.NullableSize;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 7, max = 15)
    @Column(unique = true, nullable = false, length = 15)
    private String username; // Admin or Student Code

    @NotBlank
    @Size(min = 8, max = 24)
    @Column(nullable = false, length = 24)
    private String password;

    @NullableSize(max = 31)
    @Column(length = 31)
    private String names;

    @NullableSize(max = 31)
    @Column(length = 31)
    private String paternalSurname;

    @NullableSize(max = 127)
    @Column(length = 127)
    private String maternalSurname;

    @NotBlank
    @Size(min = 7, max = 15)
    @Column(unique = true, nullable = false, length = 15)
    private String dni;

    @NotBlank
    @Email
    @Size(min = 3, max = 15)
    @Column(unique = true, nullable = false, length = 15)
    private String email;

    @NullableSize(max = 9)
    @Column(unique = true, length = 9)
    private String phone;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime lastUpdatedDate;
}
