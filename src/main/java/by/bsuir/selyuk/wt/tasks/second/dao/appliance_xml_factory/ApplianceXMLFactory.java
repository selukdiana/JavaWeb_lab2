package by.bsuir.selyuk.wt.tasks.second.dao.appliance_xml_factory;

import by.bsuir.selyuk.wt.tasks.second.dao.appliance_xml_factory.impl.FreezerXMLFactory;
import by.bsuir.selyuk.wt.tasks.second.dao.appliance_xml_factory.impl.LaptopXMLFactory;
import by.bsuir.selyuk.wt.tasks.second.dao.appliance_xml_factory.impl.OvenXMLFactory;
import by.bsuir.selyuk.wt.tasks.second.dao.appliance_xml_factory.impl.TabletPCXMLFactory;
import by.bsuir.selyuk.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
/**
 * ApplianceXMLFactory abstract class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public abstract class ApplianceXMLFactory {
    /**
     * Creates an {@link Appliance} in xml-file.
     *
     * @param document  containing information about the elements in the file
     * @param appliance added {@link Appliance}
     * @return {@link Node}
     */
    public abstract Node createApplianceXML(Document document, Appliance appliance);
    /**
     * Convenient method for adding children to element.
     *
     * @param document     containing information about the elements in the file
     * @param fieldTagName name of element-tag
     * @param value        value if this element-tag
     * @return {@link Node}
     */
    protected final Node createElement(Document document, String fieldTagName, Object value) {
        Element node = document.createElement(fieldTagName.toLowerCase().replace('_', '-'));
        node.appendChild(document.createTextNode(String.valueOf(value)));
        return node;
    }
    /**
     * Gets the {@link \Users\Lenovo\OneDrive - bsuir.by\Рабочий стол\wt2\src\main\java\by\bsuir\dshparko\wt\tasks\second\dao\creator\ApplianceCreator.java} from its applianceName.
     * If an error occurs, an {@link IllegalArgumentException} is thrown.
     *
     * @param applianceName name of appliance
     * @return {@link \Users\Lenovo\OneDrive - bsuir.by\Рабочий стол\wt2\src\main\java\by\bsuir\dshparko\wt\tasks\second\dao\creator\ApplianceCreator.java}
     */
    public static ApplianceXMLFactory getApplianceXMLFactory(String applianceName) throws EnumConstantNotPresentException {
        try {
            return switch (ApplianceTagName.valueOf(applianceName)) {
                case LAPTOP -> new LaptopXMLFactory();
                case OVEN -> new OvenXMLFactory();
                case TABLET_PC -> new TabletPCXMLFactory();
                case FREEZER -> new FreezerXMLFactory();
            };
        } catch (IllegalArgumentException e) {
            throw new EnumConstantNotPresentException(ApplianceTagName.class, applianceName);
        }

    }
}
