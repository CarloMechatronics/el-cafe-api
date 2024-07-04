package pe.elcafe.api.constraints.atleastonenotnull;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.hibernate.validator.internal.constraintvalidators.bv.AssertTrueValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = AssertTrueValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AtLeastOneNotNull {
    String message() default "{pe.elcafe.api.constraints.AtLeastOneNotNull.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String[] fieldNames();
}
