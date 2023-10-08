package lesson3.seminar3.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    // 3.1.
    SomeService ss;

//    void multipleThreeNotFiveReturnsFizz(int n) {
//        // assertEquals...
//    }

    @BeforeEach
    void testInit() {
        ss = new SomeService();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 33})
    void testFizzBuzzModThree(int i) {
        assertEquals("Fizz", ss.fizzBuzz(i));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 25, 35})
    void testFizzBuzzModFive(int i) {
        assertEquals("Buzz", ss.fizzBuzz(i));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 60, 120})
    void testFizzBuzzModFifteen(int i) {
        assertEquals("FizzBuzz", ss.fizzBuzz(i));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 7, 28, 44})
    void testFizzBuzzIncorrect(int i) {
        assertEquals(String.valueOf(i), ss.fizzBuzz(i));
    }


    @Test
    void testFirstLastBeginSix() {
        assertTrue(ss.firstLast6(new int[]{6, 1, 2, 3, 4}));
    }

    @Test
    void testFirstLastEndSix() {
        assertTrue(ss.firstLast6(new int[]{6, 1, 2, 3, 4, 5, 6}));
    }

    @Test
    void testFirstLastBeginAndEndSix() {
        assertTrue(ss.firstLast6(new int[]{6, 1, 2, 3, 4, 5, 6}));
    }

    @Test
    void testWithoutSix() {
        assertFalse(ss.firstLast6(new int[]{1, 2, 3, 4}));
    }

    @Test
    void testLuckySumAllNumbers() {
        assertEquals(6, ss.luckySum(1,2,3));
    }

    @Test
    void testLuckySumWithoutOneNumbers() {
        assertEquals(5, ss.luckySum(13,2,3));
    }

    @Test
    void testLuckySumWithoutTwoNumbers() {
        assertEquals(2, ss.luckySum(13,2,13));
    }

    @Test
    void testLuckySumWithoutThreeNumbers() {
        assertEquals(0, ss.luckySum(13,13,13));
    }
}