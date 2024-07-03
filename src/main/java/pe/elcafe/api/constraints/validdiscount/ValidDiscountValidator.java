package pe.elcafe.api.constraints.validdiscount;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.math.BigDecimal;

public class ValidDiscountValidator implements ConstraintValidator<ValidDiscount, BigDecimal> {
    @Override
    public boolean isValid(BigDecimal discount, ConstraintValidatorContext context) {
        if (discount == null)
            return true;
        return discount.compareTo(BigDecimal.ZERO) >= 0 && discount.compareTo(BigDecimal.valueOf(80)) <= 0;
    }
}
