package pe.elcafe.api.product.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    private Long id;

    private String name;

    private String presentation;

    private String sku;

    private BigDecimal price;

    private Integer stockQty;

    private String imageUrl;

    private String brandName;

    private Discount discount;
}
