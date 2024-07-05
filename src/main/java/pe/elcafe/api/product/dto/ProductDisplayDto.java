package pe.elcafe.api.product.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.discount.domain.Discount;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDisplayDto {
    private String name;

    private String sku;

    private BigDecimal price;

    private String imageUrl;

    private String brandName;

    private Discount discount;
}
