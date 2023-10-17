package lesson5.seminar5.number;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

public class MaxNumberModuleTest {

    @Test
    void testFindMaxNumber() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        MaxNumberModule maxNumberModule = mock(MaxNumberModule.class);
        when(maxNumberModule.maxNumber(nums)).thenReturn(5);

        assertEquals(5, maxNumberModule.maxNumber(nums));
    }

    @Test
    void testIntegrationFindMaxNumber() {
        RandomNumberModule generateRandom = new RandomNumberModule();
        List<Integer> numbers = generateRandom.generateRandomNumbers();

        MaxNumberModule findMax = new MaxNumberModule();
        int maxNum = findMax.maxNumber(numbers);

        numbers.sort((o1,o2) -> o1 - o2);
        assertEquals(numbers.get(0), maxNum);
    }
}
