package by.bsuir.selyuk.wt.tasks.second.dao.appliance_xml_factory.impl;

import by.bsuir.selyuk.wt.tasks.second.dao.appliance_xml_factory.ApplianceXMLFactory;
import by.bsuir.selyuk.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.Freezer;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.SearchCriteria;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
/**
 * FreezerXMLFactory class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class FreezerXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        Freezer freezer = (Freezer) appliance;
        Element freezerElement = document.createElement(ApplianceTagName.FREEZER.name().toLowerCase().replace('_', '-'));

        freezerElement.appendChild(createElement(document, SearchCriteria.Freezer.PRICE.name(), freezer.getPrice()));
        freezerElement.appendChild(createElement(document, SearchCriteria.Freezer.FREEZER_CAPACITY.name(), freezer.getFreezerCapacity()));
        freezerElement.appendChild(createElement(document, SearchCriteria.Freezer.WIDTH.name(), freezer.getWidth()));
        freezerElement.appendChild(createElement(document, SearchCriteria.Freezer.HEIGHT.name(), freezer.getHeight()));
        freezerElement.appendChild(createElement(document, SearchCriteria.Freezer.DEPTH.name(), freezer.getDepth()));
        return freezerElement;
    }
}
