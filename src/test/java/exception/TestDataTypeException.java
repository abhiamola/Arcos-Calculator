package exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDataTypeException {
    @Test
    public void testDataTypeException() {
        DataTypeException dataTypeException = Assertions.assertThrows(DataTypeException.class,()-> {
            throw new DataTypeException("this is the datatype exception");
        });

        Assertions.assertEquals("Data type exception: "+"this is the datatype exception",dataTypeException.getMessage());
    }
}
