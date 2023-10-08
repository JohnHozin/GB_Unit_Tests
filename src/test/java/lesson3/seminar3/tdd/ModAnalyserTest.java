package lesson3.seminar3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModAnalyserTest {

    MoodAnalyser mA;

    @BeforeEach
    void testInit() {
        mA = new MoodAnalyser();
    }

    @Test
    void testAnalyseMoodIsGood() {
        assertEquals("Good day", mA.analyseMood("i have a good mood"));
    }

    @Test
    void testAnalyseMoodIsBad() {
        assertEquals("Bad day", mA.analyseMood("i have a sad mood"));
    }

    @Test
    void testAnalyseMoodIsNeutral() {
        assertEquals("Neutral day", mA.analyseMood("i have a usual mood"));
    }

    @Test
    void testAnalyseMoodIsFalse() {
        assertEquals("", mA.analyseMood(""));
    }
}
