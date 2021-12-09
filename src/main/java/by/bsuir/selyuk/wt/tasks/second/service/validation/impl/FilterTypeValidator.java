package by.bsuir.selyuk.wt.tasks.second.service.validation.impl;

import by.bsuir.selyuk.wt.tasks.second.entity.FilterType;
import by.bsuir.selyuk.wt.tasks.second.service.validation.CriteriaValidator;

/**
 * FilterTypeValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class FilterTypeValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            FilterType.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
