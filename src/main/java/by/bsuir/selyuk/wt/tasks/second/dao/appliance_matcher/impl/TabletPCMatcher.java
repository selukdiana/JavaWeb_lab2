package by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher.impl;


import by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher.ApplianceMatcherFactory;
import by.bsuir.selyuk.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.Color;
import by.bsuir.selyuk.wt.tasks.second.entity.TabletPC;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.SearchCriteria;

/**
 * TabletPCMatcher class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class TabletPCMatcher extends ApplianceMatcherFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value) {
        TabletPC tabletPC = (TabletPC) appliance;

        return switch (SearchCriteria.TabletPCWithPriceFilter.valueOf(criteriaName)) {
            case MORE_THAN_CURRENT_PRICE -> tabletPC.getPrice() > (double) value;
            case LESS_THAN_CURRENT_PRICE -> tabletPC.getPrice() < (double) value;
            case PRICE, EQUAL_CURRENT_PRICE -> tabletPC.getPrice() == (double) value;
            case NAME -> ApplianceTagName.TABLET_PC.equals(value);
            case BATTERY_CAPACITY -> tabletPC.getBatteryCapacity() == (double) value;
            case DISPLAY_INCHES -> tabletPC.getDisplayInches() == (double) value;
            case MEMORY_ROM -> tabletPC.getMemoryRom() == (double) value;
            case FLASH_MEMORY_CAPACITY -> tabletPC.getFlashMemoryCapacity() == (double) value;
            case COLOR -> tabletPC.getColor().equals(Color.valueOf((String) value));
        };
    }
}
