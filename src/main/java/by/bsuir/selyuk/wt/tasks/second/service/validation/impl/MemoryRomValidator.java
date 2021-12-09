package by.bsuir.selyuk.wt.tasks.second.service.validation.impl;

import by.bsuir.selyuk.wt.tasks.second.service.validation.CriteriaValidator;

/**
 * MemoryRomValidator class.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class MemoryRomValidator implements CriteriaValidator {
    private final static double MIN_MEMORY_ROM = 0.0;
    private final static double MAX_MEMORY_ROM = 100000.0;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            double memoryRom = (Double) value;
            return ((memoryRom > MIN_MEMORY_ROM) && (memoryRom < MAX_MEMORY_ROM));
        } else {
            return false;
        }
    }
}

