package pe.elcafe.api.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.constraints.nullablesize.NullableSize;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentCreateDto {
    @NotBlank
    @Size(min = 7, max = 15)
    private String username;

    @NotBlank
    @Size(min = 8, max = 24)
    private String password;

    @NullableSize(max = 31)
    private String names;

    @NullableSize(max = 31)
    private String paternalSurname;

    @NullableSize(max = 127)
    private String maternalSurname;

    @NotBlank
    @Size(min = 7, max = 15)
    private String dni;

    @NotBlank
    @Email
    @Size(min = 3, max = 15)
    private String email;

    @NullableSize(max = 9)
    private String phone;
}
