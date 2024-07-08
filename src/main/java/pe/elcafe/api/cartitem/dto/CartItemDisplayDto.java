package pe.elcafe.api.cartitem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.product.dto.ProductDisplayDto;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CartItemDisplayDto {
    private Long shoppingCartId;

    private ProductDisplayDto product;

    private Integer quantity;

    private BigDecimal snapshotPrice;
}
