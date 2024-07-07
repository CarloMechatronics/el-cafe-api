package pe.elcafe.api.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.shoppingcart.domain.ShoppingCart;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDisplayDto {
    private String names;

    private String email;

    private ShoppingCart shoppingCart;
}
