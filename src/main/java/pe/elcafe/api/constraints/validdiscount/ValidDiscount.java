package pe.elcafe.api.constraints.validdiscount;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidDiscountValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDiscount {
    String message() default "{pe.elcafe.api.constraints.ValidDiscount.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
