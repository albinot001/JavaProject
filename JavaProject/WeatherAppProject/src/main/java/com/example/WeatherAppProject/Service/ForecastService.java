package com.example.WeatherAppProject.Service;

import com.example.WeatherAppProject.Pojo.Forecast;

import java.util.List;

public interface ForecastService {
        Forecast findById(Long id);
        List<Forecast> findAll();
        Forecast save(Forecast forecast);
        Forecast update(Forecast forecast);
        void deleteById(Long id);
}


