package pe.elcafe.api.product.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.constraints.nullablesize.NullableSize;
import pe.elcafe.api.discount.domain.Discount;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductBasicInfo {
    private String name;

    private String presentation;

    private String description;

    private String sku;

    private BigDecimal price;

    private Integer stockQty;

    private String imageUrl;

    private String brandName;

    private String categoryName;

    private Discount discount;
}
