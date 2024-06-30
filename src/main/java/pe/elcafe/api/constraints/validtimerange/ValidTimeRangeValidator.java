package pe.elcafe.api.constraints.validtimerange;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDateTime;

public class ValidTimeRangeValidator implements ConstraintValidator<ValidTimeRange, LocalDateTime> {
    private int startHour;
    private int endHour;

    @Override
    public void initialize(ValidTimeRange constraintAnnotation) {
        this.startHour = constraintAnnotation.startHour();
        this.endHour = constraintAnnotation.endHour();
    }

    @Override
    public boolean isValid(LocalDateTime reservationTime, ConstraintValidatorContext constraintValidatorContext) {
        if (reservationTime == null)
            return true;

        return reservationTime.getHour() >= startHour && reservationTime.getHour() <= endHour;
    }
}
