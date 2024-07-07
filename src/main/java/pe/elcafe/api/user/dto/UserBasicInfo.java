package pe.elcafe.api.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.user.domain.Role;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserBasicInfo {
    private String username;

    private String names;

    private String paternalSurname;

    private String maternalSurname;

    private String dni;

    private String email;

    private String phone;

    private Role role;
}
