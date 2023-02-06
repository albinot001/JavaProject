package com.example.WeatherAppProject.Controller;

import com.example.WeatherAppProject.Pojo.Forecast;
import com.example.WeatherAppProject.Service.ForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forecasts")
public class ForecastController {
    private final ForecastService forecastService;

    @Autowired
    public ForecastController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @GetMapping("/{id}")
    public Forecast findById(@PathVariable Long id) {
        return forecastService.findById(id);
    }

    @GetMapping
    public List<Forecast> findAll() {
        return forecastService.findAll();
    }

    @PostMapping
    public Forecast save(@RequestBody Forecast forecast) {
        return forecastService.save(forecast);
    }

    @PutMapping
    public Forecast update(@RequestBody Forecast forecast) {
        return forecastService.update(forecast);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        forecastService.deleteById(id);
    }
}
