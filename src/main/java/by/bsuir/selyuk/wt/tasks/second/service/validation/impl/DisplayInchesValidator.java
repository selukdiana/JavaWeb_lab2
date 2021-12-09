package by.bsuir.selyuk.wt.tasks.second.service.validation.impl;

import by.bsuir.selyuk.wt.tasks.second.service.validation.CriteriaValidator;

/**
 * DisplayInchesValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class DisplayInchesValidator implements CriteriaValidator {
    private final static double MIN_DISPLAY_INCHES = 0.0;
    private final static double MAX_DISPLAY_INCHES = 70.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double displayInches = (Double) value;
            return ((displayInches > MIN_DISPLAY_INCHES) && (displayInches < MAX_DISPLAY_INCHES));
        } else {
            return false;
        }
    }
}
