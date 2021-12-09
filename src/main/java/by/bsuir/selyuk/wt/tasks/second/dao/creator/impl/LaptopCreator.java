package by.bsuir.selyuk.wt.tasks.second.dao.creator.impl;

import by.bsuir.selyuk.wt.tasks.second.dao.constant.DAOExceptionMessage;
import by.bsuir.selyuk.wt.tasks.second.dao.creator.ApplianceCreator;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.CPU;
import by.bsuir.selyuk.wt.tasks.second.entity.Laptop;
import by.bsuir.selyuk.wt.tasks.second.entity.OS;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.SearchCriteria;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 * LaptopFactory class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class LaptopCreator  extends ApplianceCreator {
    private double price;
    private double batteryCapacity;
    private OS os;
    private double memoryRom;
    private CPU cpu;
    private double displayInches;
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();
                String laptopSearchCriteria = nodeList.item(i).getNodeName().toUpperCase().replace('-', '_');

                switch (SearchCriteria.Laptop.valueOf(laptopSearchCriteria)) {
                    case PRICE -> price = Double.parseDouble(value);
                    case BATTERY_CAPACITY -> batteryCapacity = Double.parseDouble(value);
                    case OS -> os = OS.valueOf(value);
                    case MEMORY_ROM -> memoryRom = Double.parseDouble(value);
                    case CPU -> cpu = CPU.valueOf(value);
                    case DISPLAY_INCHES -> displayInches = Double.parseDouble(value);
                    default -> throw new IllegalArgumentException(DAOExceptionMessage.ILLEGAL_ARGUMENT_APPLIANCE_FACTORY_EXCEPTION_MSG.getMessage());
                }
            }
        }

        return new Laptop(price, batteryCapacity, os, memoryRom, cpu, displayInches);
    }
}
