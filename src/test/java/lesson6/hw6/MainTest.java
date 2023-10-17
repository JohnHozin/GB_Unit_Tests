package lesson6.hw6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main listsCompare;

    private List<Integer> list1 = Arrays.asList(1,3,2,51,1);
    private List<Integer> list2 = Arrays.asList(3,2,6,4,5);
    private List<Integer> listNull = new ArrayList<>();

    @BeforeEach
    void testInit() {
        listsCompare = new Main();
    }

    @Test
    void testAverageListNull () {
        assertEquals(listsCompare.averageList(listNull), 0.0);
    }

    @Test
    void testAverageList () {
        assertEquals(listsCompare.averageList(list2), 4);
    }

    @Test
    void testCompareListsNull () {
        assertEquals(listsCompare.compareLists(listNull,listNull), "Список пуст");
    }

    @Test
    void testCompareListsFirstBigger () {
        assertEquals(listsCompare.compareLists(list1,list2), "Первый список имеет большее среднее значение");
    }

    @Test
    void testCompareListsSecondBigger () {
        assertEquals(listsCompare.compareLists(list2,list1), "Второй список имеет большее среднее значение");
    }

    @Test
    void testCompareListsSame () {
        assertEquals(listsCompare.compareLists(list1,list1), "Средние значения равны");
    }
}
