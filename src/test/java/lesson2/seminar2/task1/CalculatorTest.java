package lesson2.seminar2.task1;

import lesson2.seminar2.task1.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testEquals() {
        assertEquals(8.0, Calculator.pow(2,3), 0.001);
    }

    @Test
    public void testZeroExponent() {
        assertEquals(1.0,Calculator.pow(2,0), 0.001);
    }

    @Test
    public void testOneExponent() {
        assertEquals(2.0,Calculator.pow(2,1), 0.001);
    }

    @Test
    public void testZeroBase() {
        assertEquals(0.0,Calculator.pow(0,3), 0.001);
    }

    @Test
    public void testNegativeBase() {
        assertEquals(16.0,Calculator.pow(-2,4), 0.001);
    }

    @Test
    public void testNegativeExponent() {
        assertEquals(0.5,Calculator.pow(2,-1), 0.001);
    }
}
