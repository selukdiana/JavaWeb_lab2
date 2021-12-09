package by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher;

import by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher.impl.FreezerMatcher;
import by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher.impl.LaptopMatcher;
import by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher.impl.OvenMatcher;
import by.bsuir.selyuk.wt.tasks.second.dao.appliance_matcher.impl.TabletPCMatcher;
import by.bsuir.selyuk.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
/**
 * ApplianceMatcherFactory abstract class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public abstract class ApplianceMatcherFactory {
    /**
     * Criterion match method.
     *
     * @param appliance    specific {@link Appliance}
     * @param criteriaName name of criteria by which the comparison will be made
     * @param value        value to compare by criteria
     * @return true if appliance matches the given criteriaName and value. Otherwise, it returns false.
     */
    public abstract boolean isMatchesCriteria(Appliance appliance, String criteriaName, Object value);
    /**
     * Gets {@link ApplianceMatcherFactory} of {@link Appliance} from its applianceName.
     * If an error occurs, an {@link IllegalArgumentException} is thrown.
     *
     * @param applianceName name of {@link Appliance}
     * @return {@link ApplianceMatcherFactory}
     */
    public static ApplianceMatcherFactory getMatcher(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopMatcher();
                case OVEN -> new OvenMatcher();
                case TABLET_PC -> new TabletPCMatcher();
                case FREEZER -> new FreezerMatcher();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }
    }
}
