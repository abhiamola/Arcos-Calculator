package exception;

public class DataTypeException extends Exception {
    /**
     * Exception.
     * @param exception
     * */
    public DataTypeException(final String exception) {
        super("Data type exception: " + exception);
    }
}
