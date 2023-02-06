package com.example.WeatherAppProject;


import com.example.WeatherAppProject.Pojo.Location;
import com.example.WeatherAppProject.Pojo.WeatherData;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WeatherDataTest {
    @Test
    public void testWeatherData() {
        Location location = new Location("London", "UK", 123.45, 678.90);
        WeatherData weatherData = new WeatherData(10.0, 20.0, 30.0, 40.0, LocalDateTime.now(), location);
        assertNotNull(weatherData);
        assertEquals(10.0, weatherData.getTemperature(), 0.01);
        assertEquals(20.0, weatherData.getPrecipitation(), 0.01);
        assertEquals(30.0, weatherData.getWindSpeed(), 0.01);
        assertEquals(40.0, weatherData.getHumidity(), 0.01);
        assertEquals(location, weatherData.getLocation());
    }
}