package lesson4.lection4;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Mockito {
    public static void main(String[] args) {
        List mockedList = mock(List.class);

//        mockedList.add("one");
        when(mockedList.get(0)).thenReturn("nullValue");
        System.out.println(mockedList.get(0));
//        mockedList.clear();
    }

}
