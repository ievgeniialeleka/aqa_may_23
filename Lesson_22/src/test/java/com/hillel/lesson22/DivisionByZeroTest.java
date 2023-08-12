package com.hillel.lesson22;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DivisionByZeroTest {

    private Calculator calculator;
    private int a;
    private int b;

    @BeforeClass
    public void beforeClass() {
        a = 20;
        b = 0;
    }

    @Test(expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = "/ by zero")
    public void testDivisionByZero() {
        calculator.getQuotient(a, b);
    }
}
