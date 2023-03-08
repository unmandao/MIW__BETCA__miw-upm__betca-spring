package es.upm.miw.betca_rest.resources;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;
import java.time.Period;

public class AdultValidator implements ConstraintValidator<Adult, LocalDateTime> {
    @Override
    public void initialize(Adult constraint) {
        // Empty, not operation
    }

    @Override
    public boolean isValid(LocalDateTime localDateTime, ConstraintValidatorContext context) {

        try {
            if (localDateTime != null) {
                LocalDateTime eighteenYearsAgo = LocalDateTime.now().minus(Period.ofYears(18));
                return eighteenYearsAgo.isAfter(localDateTime);
            }
        } catch (Exception e) {
            //empty
        }
        return false;
    }

}
