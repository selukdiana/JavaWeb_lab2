package by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher.impl;

import by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher.ApplianceMatcherFactory;
import by.bsuir.selyuk.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.Oven;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.SearchCriteria;

/**
 * OvenMatcher class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class OvenMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        Oven oven = (Oven) appliance;

        return switch (SearchCriteria.OvenWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> oven.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> oven.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> oven.getPrice() == (double) value;
            case NAME -> ApplianceTagName.OVEN.equals(value);
            case POWER_CONSUMPTION -> oven.getPowerConsumption() == (double) value;
            case WEIGHT -> oven.getWeight() == (double) value;
            case CAPACITY -> oven.getCapacity() == (double) value;
            case DEPTH -> oven.getDepth() == (double) value;
            case HEIGHT -> oven.getHeight() == (double) value;
            case WIDTH -> oven.getWidth() == (double) value;
        };
    }
}
