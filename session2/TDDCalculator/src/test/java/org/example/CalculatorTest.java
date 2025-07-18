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
    void addIntegers(){
        int integerResult = calculator.add(5,6);
        assertEquals(11, integerResult, 0.001);
    }

    @Test
    void addLongs(){
        long longResult = calculator.add(3000000000L,5000000000L);
        assertEquals(8000000000L, longResult, 0.001);
    }

    @Test
    void addShorts(){
        short shortResult = calculator.add((short)10000, (short)20000);
        assertEquals(30000, shortResult, 0.001);
    }

    @Test
    void addFloats(){
        float floatResult = calculator.add(2.00f, 4.00f);
        assertEquals(6.00f, floatResult, 0.001);
    }

    @Test
    void addDoubles(){
        double doubleResult = calculator.add(2.0, 4.0);
        assertEquals(6.00, doubleResult, 0.001);
    }

    @Test
    void subtractIntegers(){
        int integerResult = calculator.subtract(5,6);
        assertEquals(-1, integerResult, 0.001);
    }

    @Test
    void subtractLongs(){
        long longResult = calculator.subtract(3000000000L,5000000000L);
        assertEquals(-2000000000L, longResult, 0.001);
    }

    @Test
    void subtractShorts(){
        short shortResult = calculator.subtract((short)10000, (short)20000);
        assertEquals(-10000, shortResult, 0.001);
    }

    @Test
    void subtractFloats(){
        float floatResult = calculator.subtract(2.00f, 4.00f);
        assertEquals(-2.00f, floatResult, 0.001);
    }

    @Test
    void subtractDoubles(){
        double doubleResult = calculator.subtract(2.0, 4.0);
        assertEquals(-2.00, doubleResult, 0.001);
    }

    @Test
    void multiplyIntegers(){
        int integerResult = calculator.multiply(5,6);
        assertEquals(30, integerResult, 0.001);
    }

    @Test
    void multiplyLongs(){
        long longResult = calculator.multiply(30L,50L);
        assertEquals(1500L, longResult, 0.001);
    }

    @Test
    void multiplyShorts(){
        short shortResult = calculator.multiply((short)10, (short)20);
        assertEquals(200, shortResult, 0.001);
    }

    @Test
    void multiplyFloats(){
        float floatResult = calculator.multiply(2.00f, 4.00f);
        assertEquals(8.00f, floatResult, 0.001);
    }

    @Test
    void multiplyDoubles(){
        double doubleResult = calculator.multiply(2.0, 4.0);
        assertEquals(8.00, doubleResult, 0.001);
    }

}