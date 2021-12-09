package by.bsuir.selyuk.wt.tasks.second.service.validation;

import by.bsuir.selyuk.wt.tasks.second.entity.criteria.SearchCriteria;
import by.bsuir.selyuk.wt.tasks.second.service.constant.ServiceExceptionMessage;
import by.bsuir.dshparko.wt.tasks.second.service.validation.impl.*;

import java.util.HashMap;
import java.util.Map;
/**
 * CriteriaValidatorFactory class with properties <b>instance</b> and <b>validators</b>.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class CriteriaValidatorFactory {
    /**
     * Field instance - instance of {@link CriteriaValidatorFactory}
     */
    private static final CriteriaValidatorFactory instance = new CriteriaValidatorFactory();
    /**
     * Field validators - {@link HashMap} of validators
     */
    private final Map<String, CriteriaValidator> validators = new HashMap<>();

    //In future plans, this initialization of validators will be
    // changed by pattern, for example - Chain of Responsibility.
    {
        validators.put(SearchCriteria.General.NAME.name(), new ApplianceNameValidator());
        validators.put(SearchCriteria.PriceFilter.MORE_THAN_CURRENT_PRICE.name(), new PriceValidator());
        validators.put(SearchCriteria.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), new PriceValidator());
        validators.put(SearchCriteria.PriceFilter.EQUAL_CURRENT_PRICE.name(), new PriceValidator());

        validators.put(SearchCriteria.Laptop.BATTERY_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.Laptop.OS.name(), new OSValidator());
        validators.put(SearchCriteria.Laptop.MEMORY_ROM.name(), new MemoryRomValidator());
        validators.put(SearchCriteria.Laptop.CPU.name(), new CPUValidator());
        validators.put(SearchCriteria.Laptop.DISPLAY_INCHES.name(), new DisplayInchesValidator());

        validators.put(SearchCriteria.Oven.POWER_CONSUMPTION.name(), new PowerConsumptionValidator());
        validators.put(SearchCriteria.Oven.WEIGHT.name(), new WeightValidator());
        validators.put(SearchCriteria.Oven.CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.Oven.DEPTH.name(), new DepthValidator());
        validators.put(SearchCriteria.Oven.HEIGHT.name(), new HeightValidator());
        validators.put(SearchCriteria.Oven.WIDTH.name(), new WidthValidator());



        validators.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.TabletPC.DISPLAY_INCHES.name(), new DisplayInchesValidator());
        validators.put(SearchCriteria.TabletPC.MEMORY_ROM.name(), new MemoryRomValidator());
        validators.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name(), new BatteryCapacityValidator());
        validators.put(SearchCriteria.TabletPC.COLOR.name(), new ColorValidator());

        validators.put(SearchCriteria.Freezer.DEPTH.name(), new DepthValidator());
        validators.put(SearchCriteria.Freezer.FREEZER_CAPACITY.name(), new FreezerCapacityValidator());
        validators.put(SearchCriteria.Freezer.WIDTH.name(), new WidthValidator());
        validators.put(SearchCriteria.Freezer.HEIGHT.name(), new HeightValidator());
    }
    /**
     * Private constructor to close the ability of instantiating {@link CriteriaValidatorFactory}.
     */
    private CriteriaValidatorFactory() {
    }

    /**
     * Gets instance of {@link CriteriaValidatorFactory}
     *
     * @return {@link CriteriaValidatorFactory} instance
     */
    public static CriteriaValidatorFactory getInstance() {
        return instance;
    }
    /**
     * Gets {@link CriteriaValidator} for a specific {@link SearchCriteria}
     * If there is no such {@link SearchCriteria}, an {@link IllegalArgumentException} is thrown.
     *
     * @param criteriaName criteriaName to get validator
     * @return {@link CriteriaValidator}  specific validator
     */
    public CriteriaValidator getValidator(String criteriaName) {
        if (validators.containsKey(criteriaName)) {
            return validators.get(criteriaName);
        }
        throw new IllegalArgumentException(ServiceExceptionMessage.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG.getMessage());
    }
}
