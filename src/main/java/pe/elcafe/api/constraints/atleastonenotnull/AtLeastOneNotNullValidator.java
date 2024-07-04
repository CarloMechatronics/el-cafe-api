package pe.elcafe.api.constraints.atleastonenotnull;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class AtLeastOneNotNullValidator implements ConstraintValidator<AtLeastOneNotNull, Object> {
    private String[] fieldNames;

    @Override
    public void initialize(AtLeastOneNotNull constraintAnnotation) {
        this.fieldNames = constraintAnnotation.fieldNames();
    }

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext context) {
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(object);
        for (String fieldName : fieldNames) {
            Object fieldValue = beanWrapper.getPropertyValue(fieldName);
            if (fieldValue != null)
                return true;
        }

        return false;
    }
}
