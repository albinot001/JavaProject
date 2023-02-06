package com.example.WeatherAppProject.Controller;
import com.example.WeatherAppProject.Pojo.WeatherData;
import com.example.WeatherAppProject.Service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weatherdata")
public class WeatherDataController {

    private final WeatherDataService weatherDataService;

    @Autowired
    public WeatherDataController(WeatherDataService weatherDataService) {
        this.weatherDataService = weatherDataService;
    }

    @GetMapping
    public List<WeatherData> getAllWeatherData() {
        return weatherDataService.findAll();
    }

    @PostMapping
    public WeatherData createWeatherData(@RequestBody WeatherData weatherData) {
        weatherDataService.save(weatherData);
        return weatherData;
    }

    @GetMapping("/{id}")
    public WeatherData getWeatherDataById(@PathVariable Long id) {
        return weatherDataService.findById(id);
    }

    @PutMapping("/{id}")
    public WeatherData updateWeatherData(@PathVariable Long id, @RequestBody WeatherData weatherData) {
        weatherData.setId(id);
        weatherDataService.save(weatherData);
        return weatherData;
    }

    @DeleteMapping("/{deleteId}")
    public void deleteWeatherData(@PathVariable Long deleteId) {
        weatherDataService.delete(weatherDataService.findById(deleteId));
    }
}
