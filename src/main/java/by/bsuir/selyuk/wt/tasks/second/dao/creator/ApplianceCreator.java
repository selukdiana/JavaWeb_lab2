package by.bsuir.selyuk.wt.tasks.second.dao.creator;

import by.bsuir.selyuk.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.selyuk.wt.tasks.second.dao.creator.impl.FreezerCreator;
import by.bsuir.selyuk.wt.tasks.second.dao.creator.impl.LaptopCreator;
import by.bsuir.selyuk.wt.tasks.second.dao.creator.impl.OvenCreator;
import by.bsuir.selyuk.wt.tasks.second.dao.creator.impl.TabletPCCreator;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import org.w3c.dom.NodeList;
/**
 * ApplianceCreator abstract class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public abstract class ApplianceCreator {
    /**
     * Creates a specific appliance.
     *
     * @param nodeList {@link NodeList}
     * @return {@link Appliance} specific appliance
     */
    public abstract Appliance createAppliance(NodeList nodeList);
    /**
     * Gets {@link ApplianceCreator} from its applianceName.
     * If an error occurs, an {@link IllegalArgumentException} is thrown.
     *
     * @param applianceName name of {@link Appliance}
     * @return {@link ApplianceCreator} specific ApplianceFactory
     */
    public static ApplianceCreator getAppliance(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopCreator();
                case OVEN -> new OvenCreator();
                case TABLET_PC -> new TabletPCCreator();
                case FREEZER -> new FreezerCreator();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }
    }
}
