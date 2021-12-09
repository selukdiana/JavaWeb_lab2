package by.bsuir.selyuk.wt.tasks.second.service.validation.impl;

import by.bsuir.selyuk.wt.tasks.second.service.validation.CriteriaValidator;

/**
 * PriceValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class PriceValidator implements CriteriaValidator {
    private final static double MIN_PRICE = 0.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > MIN_PRICE;
        } else
            return false;
    }
}

