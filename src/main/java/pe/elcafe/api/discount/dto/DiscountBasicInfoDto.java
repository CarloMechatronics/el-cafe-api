package pe.elcafe.api.discount.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.product.domain.Product;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DiscountBasicInfoDto {
    private BigDecimal discountPercentage;

    private LocalDate startDate;

    private LocalDate endDate;

    private Integer stockQty;

    private Boolean active;

    private Product product;
}
