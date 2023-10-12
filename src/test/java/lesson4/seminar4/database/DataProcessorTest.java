package lesson4.seminar4.database;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

class DataProcessorTest {

    @Test
    void testGetDataFromDatabase() {
        Database database = mock(Database.class);
        List<String> fakeData = Arrays.asList("Data1", "Data2", "Data3");
        when(database.query(anyString())).thenReturn(fakeData);

        DataProcessor dataProcessor = new DataProcessor(database);
        List<String> result = dataProcessor.processData("SELECT * FROM unittest.table_4");
        assertEquals(fakeData, result);
    }

}