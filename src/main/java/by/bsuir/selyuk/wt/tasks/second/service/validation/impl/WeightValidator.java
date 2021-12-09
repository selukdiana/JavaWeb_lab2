package by.bsuir.selyuk.wt.tasks.second.service.validation.impl;

import by.bsuir.selyuk.wt.tasks.second.service.validation.CriteriaValidator;

/**
 * WeightValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class WeightValidator implements CriteriaValidator {
    private final static double MIN_WEIGHT = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_WEIGHT;
        } else {
            return false;
        }
    }
}