package lesson4.seminar4.weather;


import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class WeatherReporterTest {

    @Test
    void testWeatherServiceCorrectTemperature() {
        WeatherService weatherService = mock(WeatherService.class);

        when(weatherService.getCurrentTemperature()).thenReturn(25);

        WeatherReporter reporter = new WeatherReporter(weatherService);

        assertEquals("Текущая температура: 25 градусов.", reporter.generateReport());

    }

}