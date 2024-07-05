package pe.elcafe.api.discount.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.elcafe.api.constraints.atleastonenotnull.AtLeastOneNotNull;
import pe.elcafe.api.constraints.validdiscount.ValidDiscount;

import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@AtLeastOneNotNull(fieldNames = {"productId", "productSku"})
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

    private String productId;

    private String productSku;
}
