package by.bsuir.selyuk.wt.tasks.second.service.validation.impl;

import by.bsuir.selyuk.wt.tasks.second.entity.OS;
import by.bsuir.selyuk.wt.tasks.second.service.validation.CriteriaValidator;

/**
 * OSValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class OSValidator implements CriteriaValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            return false;
        }
    }

}
