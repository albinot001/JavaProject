package com.example.WeatherAppProject;

import com.example.WeatherAppProject.Pojo.Forecast;
import com.example.WeatherAppProject.Pojo.Location;
import com.example.WeatherAppProject.Pojo.LocationForecast;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationForecastTest {
    @Test
    public void testLocationForecast() {
        Location location = new Location("City", "Country", 123.45, 678.90);
        Forecast forecast = new Forecast(1L, LocalDate.of(2022, 11, 30), 10, 20, location, 30.0, 40.0, 50.0, 60.0);
        LocationForecast locationForecast = new LocationForecast(location, forecast);

        assertEquals(location, locationForecast.getLocation());
        assertEquals(forecast, locationForecast.getForecast());
    }

}
