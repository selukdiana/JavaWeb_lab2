package by.bsuir.selyuk.wt.tasks.second.dao;
/**
 * DAOException class.
 * This class needed to throw exceptions on the DAO layer.
 *
 * @author Darya Shparko
 * @version 1.0
 */
public class DAOException extends Exception {

    /**
     * Parameterless {@link DAOException} constructor
     */
    public DAOException() {
        super();
    }

    /**
     * {@link DAOException} constructor with parameter
     *
     * @param message message
     */
    public DAOException(String message) {
        super(message);
    }

    /**
     * {@link DAOException} constructor with parameters
     *
     * @param message message
     * @param e       {@link Exception}
     */
    public DAOException(String message, Exception e) {
        super(message, e);
    }

    /**
     * {@link DAOException} constructor with parameter
     *
     * @param e {@link Exception}
     */
    public DAOException(Exception e) {
        super(e);
    }}
