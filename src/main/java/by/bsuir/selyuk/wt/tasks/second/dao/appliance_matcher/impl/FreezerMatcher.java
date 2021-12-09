package by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher.impl;


import by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher.ApplianceMatcherFactory;
import by.bsuir.selyuk.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.Freezer;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.SearchCriteria;

/**
 * FreezerMatcher Class
 * @author Darya Shparko
 * @version 1.0
 */
public class FreezerMatcher  extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Freezer freezer = (Freezer) appliance;

        return switch (SearchCriteria.FreezerWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> freezer.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> freezer.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> freezer.getPrice() == (double) value;
            case NAME -> ApplianceTagName.FREEZER.equals(value);
            case DEPTH -> freezer.getDepth() == (double) value;
            case HEIGHT -> freezer.getHeight() == (double) value;
            case WIDTH -> freezer.getWidth() == (double) value;
            case FREEZER_CAPACITY -> freezer.getFreezerCapacity() == (double) value;
        };
    }
}
