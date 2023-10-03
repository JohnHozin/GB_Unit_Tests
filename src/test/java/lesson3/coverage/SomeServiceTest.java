package lesson3.coverage;

import lesson3.seminar3.coverage.SomeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeServiceTest {
   // 3.1.
    SomeService ss;

    void multipleThreeNotFiveReturnsFizz(int n) {
        // assertEquals...
    }

    @BeforeEach
    void testInit() {
        ss = new SomeService();
    }

    @Test
    void testFizzBuzzModThree() {
        assertEquals("Fizz", ss.fizzBuzz(3));
    }

    @Test
    void testFizzBuzzModFive() {
        assertEquals("Buzz", ss.fizzBuzz(5));
    }

    @Test
    void testFizzBuzzModFifteen() {
        assertEquals("FizzBuzz", ss.fizzBuzz(15));
    }

    @Test
    void testFizzBuzzIncorrect() {
        assertEquals("14", ss.fizzBuzz(14));
    }
}