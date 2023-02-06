package com.example.WeatherAppProject;

import com.example.WeatherAppProject.Controller.LocationForecastController;
import com.example.WeatherAppProject.Pojo.LocationForecast;
import com.example.WeatherAppProject.Service.LocationForecastService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LocationForecastControllerTest {

    @Mock
    private LocationForecastService locationForecastService;

    @InjectMocks
    private LocationForecastController locationForecastController;

    @Test
    public void findAllTest() {
        List<LocationForecast> locationForecastList = new ArrayList<>();
        locationForecastList.add(new LocationForecast());
        when(locationForecastService.findAll()).thenReturn(locationForecastList);

        List<LocationForecast> result = locationForecastController.findAll();

        assertEquals(locationForecastList, result);
    }

    @Test
    public void findByIdTest() {
        Long id = 1L;
        LocationForecast locationForecast = new LocationForecast();
        locationForecast.setId(id);
        when(locationForecastService.findById(id)).thenReturn(locationForecast);

        LocationForecast result = locationForecastController.findById(id);

        assertEquals(locationForecast, result);
    }

    @Test
    public void saveTest() {
        LocationForecast locationForecast = new LocationForecast();
        when(locationForecastService.save(locationForecast)).thenReturn(locationForecast);

        LocationForecast result = locationForecastController.save(locationForecast);

        assertEquals(locationForecast, result);
    }

    @Test
    public void deleteTest() {
        Long id = 1L;
        LocationForecast locationForecast = new LocationForecast();
        locationForecast.setId(id);
        when(locationForecastService.findById(id)).thenReturn(locationForecast);

        locationForecastController.delete(id);
    }
}
