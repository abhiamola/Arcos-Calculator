package util;

import exception.DataTypeException;


/**
 * <h1>Math</h1>
 * A class that utility functions for working with various mathematical operations.
 * */
@SuppressWarnings("ALL")
public class NewMath {
    /**
     * This constructor is private that restrict other classes to create a direct instance of it.
     * Use static method instead.
     * */
    private NewMath() {

    }

    /**
     * Method for perform root operation
     * @param a java.lang.Object
     * @param b java.lang.Object
     * @return  result java.lang.Object
     * */
    public static Object root(Object a, Object b) throws Exception {
        System.out.println(a.getClass().getTypeName().toString().equals("java.lang.String"));

        try {
            if (a.getClass() != b.getClass()){throw new Exception("Type of 'a' and type of 'b' are not same");}
        } catch (Exception e) {
            e.printStackTrace();
        }

        // For class data type
        switch (a.getClass().getTypeName().toString()) {
            case "java.lang.Integer":
                Integer integerResult = (Integer) a * (Integer) b;

                return integerResult;

            case "java.lang.Long":
                Long longResult =(Long)a * (Long)b;
                return longResult;
            case "java.lang.Float":
                Float floatResult = (Float) a * (Float) b;
                return floatResult;
            case "java.lang.Double":
                Double doubleResult = (Double) a * (Double) b;
                return doubleResult;
            default:
                throw new DataTypeException(a.getClass().getTypeName().toString()+" is not supported for root operation");

        }

    }
    public static Object cos(Object x) {
        return null;
    }

    public static Object derivative(Object expression) {
        return null;
    }

    public static double acos(double x) {
        double pi = 3.141592653589793238;
        double acosResult = pi / 2 - (.5689111419 - .2644381021*x - .4212611542*(2*x - 1)*(2*x - 1)
                + .1475622352*(2*x - 1)*(2*x - 1)*(2*x - 1))
                / (2.006022274 - 2.343685222*x + .3316406750*(2*x - 1)*(2*x - 1) +
                .02607135626*(2*x - 1)*(2*x - 1)*(2*x - 1));
        return acosResult;
    }
}
