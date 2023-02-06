package com.example.WeatherAppProject;

import com.example.WeatherAppProject.Pojo.Forecast;
import com.example.WeatherAppProject.Pojo.Location;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForecastTest {
    @Test
    public void testGettersAndSetters() {
        Forecast forecast = new Forecast();

        Long id = 1L;
        LocalDate date = LocalDate.now();
        double minTemperature = 10.0;
        double maxTemperature = 20.0;
        Location location = new Location();
        Double ForecastTemperature = 15.0;
        Double ForecastPrecipitation = 5.0;
        Double ForecastWindSpeed = 10.0;
        Double ForecastHumidity = 50.0;

        forecast.setId(id);
        forecast.setDate(date);
        forecast.setMinTemperature(minTemperature);
        forecast.setMaxTemperature(maxTemperature);
        forecast.setLocation(location);
        forecast.setForecastTemperature(ForecastTemperature);
        forecast.setForecastPrecipitation(ForecastPrecipitation);
        forecast.setForecastWindSpeed(ForecastWindSpeed);
        forecast.setForecastHumidity(ForecastHumidity);

        assertEquals(id, forecast.getId());
        assertEquals(date, forecast.getDate());
        assertEquals(minTemperature, forecast.getMinTemperature(), 0);
        assertEquals(maxTemperature, forecast.getMaxTemperature(), 0);
        assertEquals(location, forecast.getLocation());
        assertEquals(ForecastTemperature, forecast.getForecastTemperature());
        assertEquals(ForecastPrecipitation, forecast.getForecastPrecipitation());
        assertEquals(ForecastWindSpeed, forecast.getForecastWindSpeed());
        assertEquals(ForecastHumidity, forecast.getForecastHumidity());
    }
}




