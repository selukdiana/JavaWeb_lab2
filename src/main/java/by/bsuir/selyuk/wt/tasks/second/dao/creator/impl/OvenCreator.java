package by.bsuir.selyuk.wt.tasks.second.dao.creator.impl;

import by.bsuir.selyuk.wt.tasks.second.dao.constant.DAOExceptionMessage;
import by.bsuir.selyuk.wt.tasks.second.dao.creator.ApplianceCreator;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.Oven;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.SearchCriteria;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 * OvenCreator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class OvenCreator  extends ApplianceCreator {
    private double price;
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;
    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();
                String ovenSearchCriteria = nodeList.item(i).getNodeName().toUpperCase().replace('-', '_');

                switch (SearchCriteria.Oven.valueOf(ovenSearchCriteria)) {
                    case PRICE -> price = Double.parseDouble(value);
                    case POWER_CONSUMPTION -> powerConsumption = Double.parseDouble(value);
                    case WEIGHT -> weight = Double.parseDouble(value);
                    case CAPACITY -> capacity = Double.parseDouble(value);
                    case DEPTH -> depth = Double.parseDouble(value);
                    case HEIGHT -> height = Double.parseDouble(value);
                    case WIDTH -> width = Double.parseDouble(value);
                    default -> throw new IllegalArgumentException(DAOExceptionMessage.ILLEGAL_ARGUMENT_APPLIANCE_FACTORY_EXCEPTION_MSG.getMessage());
                }

            }
        }
        return new Oven(price, powerConsumption, weight, capacity, depth, height, width);
    }
}
