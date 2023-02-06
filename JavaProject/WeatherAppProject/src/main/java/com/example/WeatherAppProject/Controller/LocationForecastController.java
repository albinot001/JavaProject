package com.example.WeatherAppProject.Controller;

import com.example.WeatherAppProject.Pojo.LocationForecast;
import com.example.WeatherAppProject.Service.LocationForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location-forecast")
public class LocationForecastController {
    private final LocationForecastService locationForecastService;

    @Autowired
    public LocationForecastController(LocationForecastService locationForecastService) {
        this.locationForecastService = locationForecastService;
    }

    @GetMapping("/all")
    public List<LocationForecast> findAll() {
        return locationForecastService.findAll();
    }

    @GetMapping("/{id}")
    public LocationForecast findById(@PathVariable Long id) {
        return locationForecastService.findById(id);
    }

    @PostMapping("/save")
    public LocationForecast save(@RequestBody LocationForecast locationForecast) {
        return locationForecastService.save(locationForecast);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        LocationForecast locationForecast = locationForecastService.findById(id);
        if (locationForecast != null) {
            locationForecastService.delete(locationForecast);
        }
    }
}
