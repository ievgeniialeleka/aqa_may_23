package com.hillel.lesson20;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @AfterAll
    static void afterAll() {
        calculator = null;
    }

    @Test
    @Order(1)
    @DisplayName("Addition Test")
    void testGetSum() {
        int actual = calculator.getSum(4,8);
        int expected = 12;
        assertEquals(expected, actual);
    }

   @Test
   @Order(2)
    @DisplayName("Subtraction Test")
    void testGetDiff() {
        int result = calculator.getDiff(18, 8);
        assertTrue(result == 10);
    }

    @ParameterizedTest
    @Order(3)
    @DisplayName("Multiplication Test")
    @MethodSource("integerProvider")
    void testGetProduct(int a, int b, int result) {
        int actual = calculator.getProduct(a,b);
        int expected = result;
        assertEquals(expected, actual);
    }
    public static Stream<Arguments> integerProvider() {
        return Stream.of(
                Arguments.arguments(2,3,6),
                Arguments.arguments(8,8,64),
                Arguments.arguments(3,3,9),
                Arguments.arguments(6,6,36)
        );
    }

    @ParameterizedTest
    @Order(4)
    @DisplayName("Division Test")
    @CsvSource({
            "18,3,6",
            "27,3,9",
            "16,2,8"
    })
    void testGetQuotient(int a, int b, int result) {
        int actual = calculator.getQuotient(a, b);
        int expected = result;
        assertEquals(expected,actual);
    }

    @Test
    @Order(5)
    @DisplayName("Division by Zero Test")
    void testDivisionByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class,
                () -> calculator.getQuotient(3, 0));
        assertEquals("/ by zero", exception.getMessage());

    }
}