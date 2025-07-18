package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void sumIntegers(){
        int integerResult = calculator.sum(5,6);
        assertEquals(11, integerResult, 0.001);
    }

    @Test
    void sumLongs(){
        long longResult = calculator.sum(3000000000L,5000000000L);
        assertEquals(8000000000L, longResult, 0.001);
    }

    @Test
    void sumShorts(){
        short shortResult = calculator.sum((short)10000, (short)20000);
        assertEquals(30000, shortResult, 0.001);
    }

    @Test
    void sumFloats(){
        float floatResult = calculator.sum(2.00f, 4.00f);
        assertEquals(6.00f, floatResult, 0.001);
    }

    @Test
    void sumDoubles(){
        double doubleResult = calculator.sum(2.0, 4.0);
        assertEquals(6.00, doubleResult, 0.001);
    }

    @Test
    void differenceIntegers(){
        int integerResult = calculator.difference(5,6);
        assertEquals(-1, integerResult, 0.001);
    }

    @Test
    void differenceLongs(){
        long longResult = calculator.difference(3000000000L,5000000000L);
        assertEquals(-2000000000L, longResult, 0.001);
    }

    @Test
    void differenceShorts(){
        short shortResult = calculator.difference((short)10000, (short)20000);
        assertEquals(-10000, shortResult, 0.001);
    }

    @Test
    void differenceFloats(){
        float floatResult = calculator.difference(2.00f, 4.00f);
        assertEquals(-2.00f, floatResult, 0.001);
    }

    @Test
    void differenceDoubles(){
        double doubleResult = calculator.difference(2.0, 4.0);
        assertEquals(-2.00, doubleResult, 0.001);
    }



}