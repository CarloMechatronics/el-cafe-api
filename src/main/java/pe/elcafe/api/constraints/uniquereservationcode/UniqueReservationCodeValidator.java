package pe.elcafe.api.constraints.uniquereservationcode;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueReservationCodeValidator implements ConstraintValidator<UniqueReservationCode, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false; // TODO: Implement when reservation repository is created
    }
}
