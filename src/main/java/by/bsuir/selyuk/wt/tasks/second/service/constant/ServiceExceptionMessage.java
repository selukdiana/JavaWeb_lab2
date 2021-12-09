package by.bsuir.selyuk.wt.tasks.second.service.constant;
/**
 * ServiceExceptionMessage enum.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public enum ServiceExceptionMessage {
    INVALID_CRITERIA_EXCEPTION_MSG("Criteria is not Valid!"),
    ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG("No such appliance search criteria exists.");

    private final String message;

    /**
     * Private constructor to close the ability of instantiating {@link ServiceExceptionMessage}.
     *
     * @param message message of {@link by.epam.task02.service.ServiceException}
     */
    private ServiceExceptionMessage(String message) {
        this.message = message;
    }

    /**
     * Gets message
     *
     * @return message
     */
    public String getMessage() {
        return message;
    }
}
