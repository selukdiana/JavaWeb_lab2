package by.bsuir.selyuk.wt.tasks.second.dao.constant;
/**
 * DaoExceptionMessage enum.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public enum DAOExceptionMessage {
    ILLEGAL_ARGUMENT_APPLIANCE_FACTORY_EXCEPTION_MSG("No such appliance factory exists.");

    private final String message;
    /**
     * Private constructor to close the ability of instantiating {@link DaoExceptionMessage}.
     *
     * @param message message of DaoException
     */
    private DAOExceptionMessage(String message) {
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
