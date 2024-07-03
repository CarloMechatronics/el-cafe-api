package pe.elcafe.api.discount.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pe.elcafe.api.constraints.validdiscount.ValidDiscount;
import pe.elcafe.api.product.domain.Product;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
public class DiscountCreateDto {
    @NotNull
    @ValidDiscount
    private BigDecimal discountPercentage;

    @NotNull
    @FutureOrPresent
    private LocalDate startDate;

    @NotNull
    @Future
    private LocalDate endDate;

    @PositiveOrZero
    private Integer stockQty;

    private Boolean active;

    private Product product;

    private String sku;
}
