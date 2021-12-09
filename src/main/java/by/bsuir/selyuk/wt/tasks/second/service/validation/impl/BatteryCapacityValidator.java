package by.bsuir.selyuk.wt.tasks.second.service.validation.impl;

import by.bsuir.selyuk.wt.tasks.second.service.validation.CriteriaValidator;

/**
 * BatteryCapacityValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class BatteryCapacityValidator implements CriteriaValidator {
    private final static double MIN_BATTERY_CAPACITY = 0.0;
    private final static double MAX_BATTERY_CAPACITY = 200000.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double batteryCapacity = (Double) value;
            return ((batteryCapacity > MIN_BATTERY_CAPACITY) && (batteryCapacity < MAX_BATTERY_CAPACITY));
        } else {
            return false;
        }
    }
}
