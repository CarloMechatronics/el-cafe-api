package pe.elcafe.api.product.dto;


import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.constraints.atleastonenotnull.AtLeastOneNotNull;
import pe.elcafe.api.constraints.nullablesize.NullableSize;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@AtLeastOneNotNull(fieldNames = {"brandId", "brandName"})
public class ProductCreateDto {
    @NotBlank
    @Size(min = 3, max = 63)
    private String name;

    @NullableSize(max = 255)
    private String description;

    @NullableSize(max = 31)
    private String sku;

    @NotNull
    @DecimalMin(value = "0.0")
    private BigDecimal price;

    @PositiveOrZero
    private Integer stockQty;

    @NullableSize(min=3)
    private String imageUrl;

    private Boolean active;

    private String brandId;

    private String brandName;

    @NotBlank
    private String categoryName;
}
