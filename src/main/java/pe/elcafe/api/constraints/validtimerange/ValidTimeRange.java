package pe.elcafe.api.constraints.validtimerange;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidTimeRangeValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidTimeRange {
    String message() default "{pe.elcafe.api.constraints.ValidTimeRange.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int startHour() default 9;

    int endHour() default 21;
}
