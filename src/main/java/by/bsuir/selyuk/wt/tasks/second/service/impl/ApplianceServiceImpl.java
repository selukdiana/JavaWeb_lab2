package by.bsuir.selyuk.wt.tasks.second.service.impl;

import by.bsuir.selyuk.wt.tasks.second.dao.ApplianceDAO;
import by.bsuir.selyuk.wt.tasks.second.dao.DAOException;
import by.bsuir.selyuk.wt.tasks.second.dao.DAOFactory;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.Criteria;
import by.bsuir.selyuk.wt.tasks.second.service.ApplianceService;
import by.bsuir.selyuk.wt.tasks.second.service.ServiceException;
import by.bsuir.selyuk.wt.tasks.second.service.constant.ServiceExceptionMessage;
import by.bsuir.selyuk.wt.tasks.second.service.validation.Validator;

import java.util.List;
/**
 * ApplianceServiceImpl class.
 * Implements {@link ApplianceService} and works with {@link by/bsuir/selyuk/wt/tasks/second/dao/ApplianceDAO.java}.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class ApplianceServiceImpl implements ApplianceService {

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        if (!Validator.isCriteriaValid(criteria)) {
            throw new ServiceException(ServiceExceptionMessage.INVALID_CRITERIA_EXCEPTION_MSG.getMessage());
        }

        List<Appliance> appliances;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            appliances = applianceDAO.find(criteria);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public boolean add(String applianceName, Appliance appliance) throws DAOException, ServiceException {
        if (applianceName.isEmpty() || appliance == null) {
            throw new ServiceException(ServiceExceptionMessage.INVALID_CRITERIA_EXCEPTION_MSG.getMessage());
        }

        boolean isApplianceAdded;
        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();
        isApplianceAdded = applianceDAO.add(applianceName, appliance);
        return isApplianceAdded;
    }

}
