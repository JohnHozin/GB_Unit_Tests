package lesson3.hw3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainHWTest {

    MainHW number;

    @BeforeEach
    void testInit() {
        number = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4, 10, 26, 36})
    void testEvenOddNumberTrue (int i) {
        assertTrue(number.evenOddNumber(i));
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, 3, 11, 25, 35})
    void testEvenOddNumberFalse (int i) {
        assertFalse(number.evenOddNumber(i));
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 30, 45, 50, 99})
    void testNumberInIntervalTrue (int i) {
        assertTrue(number.numberInInterval(i));
    }

    @ParameterizedTest
    @ValueSource(ints = {-100, 1, 25, 100, 1000})
    void testNumberInIntervalFalse (int i) {
        assertFalse(number.numberInInterval(i));
    }
}
