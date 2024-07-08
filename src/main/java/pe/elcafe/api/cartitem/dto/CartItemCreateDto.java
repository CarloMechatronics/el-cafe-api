package pe.elcafe.api.cartitem.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.constraints.atleastonenotnull.AtLeastOneNotNull;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@AtLeastOneNotNull(fieldNames = {"productId", "productSku"})
public class CartItemCreateDto {
    @NotNull
    private Long shoppingCartId;

    @NotNull
    private String productId;

    @NotNull
    private String productSku;

    @NotNull
    private BigDecimal snapshotPrice;
}
