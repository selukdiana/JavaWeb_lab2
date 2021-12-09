package by.bsuir.selyuk.wt.tasks.second.dao.appliance_xml_factory.impl;

import by.bsuir.selyuk.wt.tasks.second.dao.appliance_xml_factory.ApplianceXMLFactory;
import by.bsuir.selyuk.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.TabletPC;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.SearchCriteria;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
/**
 * TabletPCXMLFactory class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class TabletPCXMLFactory extends ApplianceXMLFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public Node createApplianceXML(Document document, Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;
        Element tabletPCElement = document.createElement(ApplianceTagName.TABLET_PC.name().toLowerCase().replace('_', '-'));

        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.PRICE.name(), tabletPC.getPrice()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.BATTERY_CAPACITY.name(), tabletPC.getBatteryCapacity()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.DISPLAY_INCHES.name(), tabletPC.getDisplayInches()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.MEMORY_ROM.name(), tabletPC.getMemoryRom()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(), tabletPC.getFlashMemoryCapacity()));
        tabletPCElement.appendChild(createElement(document, SearchCriteria.TabletPC.COLOR.name(), tabletPC.getColor()));
        return tabletPCElement;
    }
}
