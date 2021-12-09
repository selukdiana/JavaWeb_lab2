package by.bsuir.selyuk.wt.tasks.second.service;

import by.bsuir.selyuk.wt.tasks.second.dao.DAOException;
import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.Criteria;

import java.util.List;
/**
 * ApplianceService interface of an ApplianceService class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public interface ApplianceService {

    /**
     * Validates {@link by/bsuir/dshparko/wt/tasks/second/entity/criteria/SearchCriteria.java} and finds all {@link Appliance} that match the given search criteria.
     *
     * @param criteria {@link by/bsuir/dshparko/wt/tasks/second/entity/criteria/SearchCriteria.java} with which sorting occurs
     * @return {@link List<Appliance>}  list of {@link Appliance} found
     * @throws DAOException     when throwing an exception on a DAO layer
     * @throws ServiceException when throwing an exception on a Service layer
     */
    List<Appliance> find(Criteria criteria) throws DAOException, ServiceException;


    /**
     * Adds {@link Appliance} to xml-file.
     *
     * @param applianceName name of {@link Appliance}
     * @param appliance     {@link Appliance}
     * @return true when added without exception, otherwise false
     * @throws DAOException     when throwing an exception on a DAO layer
     * @throws ServiceException when throwing an exception on a Service layer
     */
    boolean add(String applianceName, Appliance appliance) throws DAOException, ServiceException;

}