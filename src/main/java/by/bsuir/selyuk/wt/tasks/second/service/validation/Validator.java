package by.bsuir.selyuk.wt.tasks.second.service.validation;

import by.bsuir.selyuk.wt.tasks.second.entity.criteria.Criteria;
/**
 * Validator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class Validator {

    /**
     * Validates criteria by its {@link by/bsuir/dshparko/wt/tasks/second/entity/criteria/SearchCriteria.java}.
     *
     * @param criteria {@link Criteria} to validate
     * @return true if criteria is valid. Otherwise, false.
     */public static boolean isCriteriaValid(Criteria criteria) {
        if (criteria == null) {
            return false;
        }

        return criteria.getCriteriaMap().entrySet().stream().allMatch(
                entry -> CriteriaValidatorFactory.getInstance()
                        .getValidator(entry.getKey())
                        .isCriteriaValid(entry.getValue()));
    }
}
