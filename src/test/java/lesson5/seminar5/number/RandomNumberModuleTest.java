package lesson5.seminar5.number;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

public class RandomNumberModuleTest {

    @Test
    void testGenerateIntegerList() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        RandomNumberModule randomNumbers = mock(RandomNumberModule.class);
        when(randomNumbers.generateRandomNumbers()).thenReturn(nums);

        assertEquals(nums, randomNumbers.generateRandomNumbers());
    }
}
