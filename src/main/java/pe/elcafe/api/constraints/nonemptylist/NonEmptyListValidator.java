package pe.elcafe.api.constraints.nonemptylist;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class NonEmptyListValidator implements ConstraintValidator<NonEmptyList, List<?>> {
    @Override
    public boolean isValid(List<?> list, ConstraintValidatorContext context) {
        return list != null && !list.isEmpty();
    }
}
