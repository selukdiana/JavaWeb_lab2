package by.bsuir.selyuk.wt.tasks.second.entity.criteria;
/**
 * SearchCriteria class.
 * Contains all search criteria.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public final class SearchCriteria {
    /**
     * Contains {@link General} search criteria
     */
    public enum General {
        NAME
    }
    /**
     * Contains {@link by/bsuir/dshparko/wt/tasks/second/entity/Oven.java} search criteria
     */
    public enum Oven {
        PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }
    /**
     * Contains {@link by/bsuir/dshparko/wt/tasks/second/entity/Laptop.java} search criteria
     */
    public enum Laptop {
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }
    /**
     * Contains {@link by/bsuir/dshparko/wt/tasks/second/entity/TabletPC.java} search criteria
     */
    public enum TabletPC {
        PRICE, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }
    /**
     * Contains {@link by/bsuir/dshparko/wt/tasks/second/entity/Freezer.java} search criteria
     */
    public enum Freezer {
        PRICE, FREEZER_CAPACITY, DEPTH, HEIGHT, WIDTH
    }
    /**
     * Contains {@link PriceFilter} search criteria
     */
    public enum PriceFilter {
        MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE
    }
    /**
     * Contains {@link Oven} and {@link PriceFilter} search criteria
     */
    public enum OvenWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
    }
    /**
     * Contains {@link Laptop} and {@link PriceFilter} search criteria
     */
    public enum LaptopWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }
    /**
     * Contains {@link TabletPC} and {@link PriceFilter} search criteria
     */
    public enum TabletPCWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
    }
    /**
     * Contains {@link Freezer} and {@link PriceFilter} search criteria
     */
    public enum FreezerWithPriceFilter {
        NAME, MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE,
        PRICE, FREEZER_CAPACITY, DEPTH, HEIGHT, WIDTH
    }
    /**
     * Private constructor to close the ability of instantiating SearchCriteria.
     */
    private SearchCriteria() {
    }
}
