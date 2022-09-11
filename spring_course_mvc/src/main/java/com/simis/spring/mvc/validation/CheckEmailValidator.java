package com.simis.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<EmailAnnotation, String> {
    String endOfEmail;
    @Override
    public void initialize(EmailAnnotation constraintAnnotation) {
        endOfEmail = constraintAnnotation.value();
    }
    @Override
    public boolean isValid(String emailToCheck, ConstraintValidatorContext constraintValidatorContext) {
        return emailToCheck.endsWith(endOfEmail);
    }
}
