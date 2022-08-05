package util;


import exception.DataTypeException;
import org.junit.jupiter.api.*;

public class TestNewMath {
    @Test
    public void testPow() throws Exception {
        int expected = 4;
        int result = (int) NewMath.pow(2,2);

        Assertions.assertEquals(expected,result);

        double expected2 = 4.0;
        double result2 = (double) NewMath.pow(2.0,2);

        Assertions.assertEquals(expected2,result2);

        double expected3 = 8.0;
        double result3 = (double) NewMath.pow(2.0,3);

        Assertions.assertEquals(expected3,result3);
    }

    @Test
    public void testRoundFunction() {
        double result = NewMath.round(10.4);
        double expected = 10;
        Assertions.assertEquals(expected,result);

        double result2 = NewMath.round(10.5);
        double expected2 = 11;
        Assertions.assertEquals(expected2,result2);

        double result3 = NewMath.round(10.6);
        double expected3 = 11;
        Assertions.assertEquals(expected3,result3);

        double result4 = NewMath.round(2.000004);
        double expected4 = 2;
        Assertions.assertEquals(expected4,result4);
    }

    @Test
    public void testConvertRadToDegree() {
        int expected = 38;
        int result = NewMath.convertRadToDegree(0.6632);

        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testGetComplementary() {
        double expected = 0.2;
        double result = NewMath.getComplementaryAngle(5);

        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testGetSqrt() throws Exception {
        double expected = 8.0;
        double result = (double) NewMath.getSqrt(64.0);

        Assertions.assertEquals(expected,result);

        double expected2 = 64.0;
        int result2 = (int) NewMath.getSqrt(4096);

        Assertions.assertEquals(expected2,result2);
    }

    @Test
    public void testPolynomialEval() throws Exception {
        double expected = 0.13958644822857544;
        double result = NewMath.getPolynomialEval(0.1405);

        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testGetPartialIdentity() throws Exception {
        double expected = 0.14054993642988495;
        double result = NewMath.getPartialIdentity(0.7813);

        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testArcTan() throws Exception {
        double expected = 0.6632;
        double result = NewMath.arctan(0.7813);

        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testArcCos() throws Exception {
        double expected = 0.6632;
        double result = NewMath.arccos(0.7880);

        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testAbs() {
        double expected = 3;
        double result = NewMath.getAbs(3);
        Assertions.assertEquals(expected,result);
    }


}
