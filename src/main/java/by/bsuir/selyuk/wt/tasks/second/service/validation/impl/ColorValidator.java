package by.bsuir.selyuk.wt.tasks.second.service.validation.impl;

import by.bsuir.selyuk.wt.tasks.second.entity.Color;
import by.bsuir.selyuk.wt.tasks.second.service.validation.CriteriaValidator;

/**
 * ColorValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class ColorValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */@Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }
}
