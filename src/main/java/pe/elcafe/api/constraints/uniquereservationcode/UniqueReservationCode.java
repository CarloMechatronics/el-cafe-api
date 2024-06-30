package pe.elcafe.api.constraints.uniquereservationcode;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueReservationCodeValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueReservationCode {
    String message() default "{pe.elcafe.api.constraints.UniqueReservationCode.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
