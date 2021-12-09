package by.bsuir.selyuk.wt.tasks.second.service.validation.impl;

import by.bsuir.selyuk.wt.tasks.second.service.validation.CriteriaValidator;

/**
 * PowerConsumptionValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class PowerConsumptionValidator implements CriteriaValidator {
    private final static double MIN_POWER_CONSUMPTION = 0.0;
    private final static double MAX_POWER_CONSUMPTION = 100000.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double powerConsumption = (Double) value;
            return ((powerConsumption > MIN_POWER_CONSUMPTION) && (powerConsumption < MAX_POWER_CONSUMPTION));
        } else {
            return false;
        }
    }
}
