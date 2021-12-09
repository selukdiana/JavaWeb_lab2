package by.bsuir.selyuk.wt.tasks.second.service.validation;
/**
 * CriteriaValidator interface.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public interface CriteriaValidator {

    /**
     * Validate value of {@link by/bsuir/dshparko/wt/tasks/second/entity/criteria/SearchCriteria.java}
     * In the implementation of this method, an exception is not thrown if the data is invalid,
     * but return false, since it is more convenient to process boolean in {@link Validator} with a lambda expression.
     *
     * @param value value to validate
     * @return true, if value is valid. Otherwise, false.
     */
    boolean isCriteriaValid(Object value);
}
