package by.bsuir.selyuk.wt.tasks.second.main;

import by.bsuir.selyuk.wt.tasks.second.dao.DAOException;
import by.bsuir.selyuk.wt.tasks.second.dao.constant.ApplianceTagName;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.Criteria;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.SearchCriteria;
import by.bsuir.selyuk.wt.tasks.second.service.ApplianceService;
import by.bsuir.selyuk.wt.tasks.second.service.ServiceException;
import by.bsuir.selyuk.wt.tasks.second.service.ServiceFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ServiceException, DAOException {
        List<Appliance> appliances;

        try {
            ServiceFactory factory = ServiceFactory.getInstance();
            ApplianceService service = factory.getApplianceService();

            //////////////////////////////////////////////////////////////////

            Criteria criteriaLaptop = new Criteria(ApplianceTagName.LAPTOP.name());
            criteriaLaptop.add(SearchCriteria.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), 1000.0);

            appliances = service.find(criteriaLaptop);

            System.out.println("Find all laptops that price is less 1000.0.");
            PrinterApplianceInfo.print(appliances);

            //////////////////////////////////////////////////////////////////

            Criteria criteriaOven = new Criteria(ApplianceTagName.OVEN.name());
            criteriaOven.add(SearchCriteria.Oven.DEPTH.name(), 60.0);
            criteriaOven.add(SearchCriteria.Oven.HEIGHT.name(), 30.0);

            appliances = service.find(criteriaOven);

            System.out.println("\nFind all ovens that HEIGHT is 30.0, DEPTH is 60.0.");
            PrinterApplianceInfo.print(appliances);

            //////////////////////////////////////////////////////////////////

            Criteria criteriaTabletPC = new Criteria(ApplianceTagName.TABLET_PC.name());
            criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.name(), "GREEN");
            criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.name(), 15.0);
            criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.name(), 12000.0);

            appliances = service.find(criteriaTabletPC);

            System.out.println("\nFind all tabletPC-s that COLOR is GREEN, DISPLAY_INCHES is 15.0, MEMORY_ROM is 12000.0.");
            PrinterApplianceInfo.print(appliances);

            //////////////////////////////////////////////////////////////////

            Criteria criteriaFreezer = new Criteria(ApplianceTagName.FREEZER.name());
            criteriaFreezer.add(SearchCriteria.PriceFilter.MORE_THAN_CURRENT_PRICE.name(), 300.0);

            appliances = service.find(criteriaFreezer);

            System.out.println("\nFind all freezer that price is more than 300.0.");
            PrinterApplianceInfo.print(appliances);

            //////////////////////////////////////////////////////////////////

            Criteria criteriaWithEmptyGroupSearchName = new Criteria("");
            criteriaWithEmptyGroupSearchName.add(SearchCriteria.PriceFilter.MORE_THAN_CURRENT_PRICE.name(), 300.0);

            appliances = service.find(criteriaWithEmptyGroupSearchName);

            System.out.println("\nFind all appliances that price is more than 300.0 because criteria has empty groupSearchName.");
            PrinterApplianceInfo.print(appliances);

            //////////////////////////////////////////////////////////////////

        } catch (DAOException | ServiceException | NullPointerException exception) {
            System.err.println(exception.getLocalizedMessage());
            exception.printStackTrace();
        }

    }
}
