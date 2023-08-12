package com.hillel.lesson22;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivisionTestWithParameters {
    Calculator calculator;

    @BeforeTest
    public void init() {
        calculator = new Calculator();
    }

    @Parameters({"int_param1", "int_param2", "int_param3"})
    @Test
    public void testGetQuotient(int a, int b, int result) {
        int actual = calculator.getQuotient(a, b);
        int expected = result;
        Assert.assertEquals(actual, expected);
    }

    @AfterTest
    public void afterTest() {
        calculator = null;
    }
}
