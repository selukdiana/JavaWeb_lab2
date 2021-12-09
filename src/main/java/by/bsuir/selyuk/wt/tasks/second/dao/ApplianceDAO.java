package by.bsuir.selyuk.wt.tasks.second.dao;

import by.bsuir.selyuk.wt.tasks.second.entity.Appliance;
import by.bsuir.selyuk.wt.tasks.second.entity.criteria.Criteria;

import java.util.List;

/**
 * ApplianceDAO interface of an applianceDao class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public interface ApplianceDAO {
    /**
     * Finds all {@link Appliance} that match the given criteria.
     *
     * @param criteria {@link by/bsuir/dshparko/wt/tasks/second/entity/criteria/SearchCriteria.java} with which sorting occurs
     * @return {@link List<Appliance>}  list of appliances found
     * @throws DAOException when throwing an exception on a DAO layer
     */
    List<Appliance> find(Criteria criteria) throws DAOException;
    /**
     * Adds {@link Appliance} to xml-file.
     *
     * @param applianceName name of {@link Appliance}
     * @param appliance     {@link Appliance}
     * @return true when added without exception, otherwise false
     * @throws DAOException when throwing an exception on a DAO layer
     */
    boolean add(String applianceName, Appliance appliance) throws DAOException;

}
