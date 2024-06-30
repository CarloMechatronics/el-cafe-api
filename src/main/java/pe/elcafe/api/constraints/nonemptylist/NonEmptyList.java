package pe.elcafe.api.constraints.nonemptylist;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = NonEmptyListValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface NonEmptyList {
    String message() default "{pe.elcafe.api.constraints.NonEmptyList.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
