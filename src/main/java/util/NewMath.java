package util;

import exception.DataTypeException;


/**
 * <h1>Math</h1>
 * A class that utility functions for
 * working with various mathematical operations.
 * */
@SuppressWarnings("ALL")
public final class NewMath {
    /**
     * This constructor is private that restrict
     * other classes to create a direct instance of it.
     * Use static method instead.
     * */
    private NewMath() {

    }

    /**
     * Method for perform root operation.
     * @param a
     * @param power
     * @return  result java.lang.Object
     * */
    public static Object pow(final Object a, final int power) throws Exception {
        switch (a.getClass().getTypeName().toString()) {
            case "java.lang.Double":
                double returnable = 1;
                for (int i = 0; i < power; i++) {
                    returnable = returnable * (double) a;
                }
                return returnable;

            case "java.lang.Integer":
                Integer returnableInt = (Integer) a;
                for (int i = 1; i < power; i++) {
                    returnableInt = returnableInt * (Integer) a;
                }
                return returnableInt;
            default:
                throw new DataTypeException("Type doesn't match");
        }
    }
    /**
     * A method that used to evaluate the arccos value.
     * @param val
     * @return  double
     * */
    public static double arccos(final double val) throws Exception {
        final double pi = 3.141592653589793238;
       double x = val;
        final double two = 2;

        if (x <= -1) {
            return pi;
        }

        if (x >= 1) {
            return 0;
        }
        final double inZero = 1.5708;

        if (x == 0) {
            return inZero;
        }

        double expression = (double) getSqrt(1 - (double) pow(x, 2)) / x;
        System.out.println("value before arccos " + expression);
        return arctan(expression);
    }

    /**
     * A method that evaluates the value of arctan.
     * @param val
     * @return double
     * */
    public static double arctan(final double val) throws Exception {
        double x = val;
        final double pi = 3.141592653589793238;

        System.out.println("value of non 1 value  " + x);

        final double two = 2;


//        if(x > 1) {
//            x = (pi / two) - arctan(1/x);
//        }


        if (x < 0) {
            x = x * -1;
        }

        final double comp = 0.268;
        if (x  > comp) {
            final int six = 6;
            return Double.parseDouble(
                    String.format("%.4f", pi / six
                            +
                            arctan(getPartialIdentity(x))));
        }



        double result = Double.parseDouble(
                String.format("%.4f", getPolynomialEval(x))
        );



        return result;
    }

    /**
     * A method that get round value.
     * @param x
     * @return int
     * */
    public static int round(final double x) {
        String formatedX = String.format("%.0f", x);
        Integer formatedXToInteger = Integer.parseInt(formatedX);

        double subValue = x - formatedXToInteger;

        final double half = 0.5;
        if (subValue < half || subValue == half) {
            return formatedXToInteger;
        } else if (subValue > half) {
            return formatedXToInteger + 1;
        }
        return 0;
    }

    /**
     * A method that convert radian values to degree.
     * @param rad
     * @return int
     * */
    public static int convertRadToDegree(final double rad) {
        final double pi = 3.141592653589793238;

        final int perpendicular = 180;
        return Integer.parseInt(
                String.format("%.0f", (perpendicular / pi) * rad)
        );
    }

    /**
     * A method that get complementary angle.
     * @param x
     * @return double
     * */
    public static double getComplementaryAngle(final double x) {
        return 1 / x;
    }

    /**
     * A method that get square root of a number.
     * @param x
     * @return int
     * */
    public static Object getSqrt(final Object x) throws Exception {
        double t;
        int t2;

        switch (x.getClass().getTypeName().toString()) {
            case "java.lang.Double":
                double sqrtroot = (double) x / 2;
                do {
                    t = sqrtroot;
                    sqrtroot = (t + ((double) x / t)) / 2;
                }
                while ((t - sqrtroot) != 0);
                return sqrtroot;
            case "java.lang.Integer":
                Integer intX = (Integer) x;
                Integer r2 = (Integer) x;
                final int ten = 10;
                int precesion2 = (int) pow(ten, -ten);

                while (getAbs(intX - r2 * r2) > precesion2) {
                    r2 = (r2 + intX / r2) / 2;
                }
                return r2;
            default:
                throw new DataTypeException(
                        " " + x.getClass().getTypeName().toString()
                                + " not supported for sqrt method");
        }
    }


    /**
     * A method that get polynomial evaluation.
     * @param x
     * @return int
     * */
    public static double getPolynomialEval(final double x) throws Exception {
        final int three = 3;
        final int five = 5;
        return x - (double) pow(x, three) / three
                + (double) pow(x, five) / five;
    }

    /**
     * A method that get partial Identity.
     * @param x
     * @return int
     * */
    public static double getPartialIdentity(final double x) throws Exception {
        final double threeSqrt = 1.732050808;
        return (double) (threeSqrt * x - 1) / (threeSqrt + x);
    }
    /**
     * A method that return absolute value of a double value.
     * @param x
     * @return int
     * */
    public static double getAbs(final double x) {
        if (x >= 0) {
            return x;
        } else {
            return x * (-1);
        }
    }

}
