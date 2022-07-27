package exception;

public class DataTypeException extends Exception{
    public DataTypeException(String exception) {
        super("Data type exception: "+exception);
    }
}
