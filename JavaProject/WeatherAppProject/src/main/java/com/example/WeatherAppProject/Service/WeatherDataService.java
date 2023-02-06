package com.example.WeatherAppProject.Service;

import com.example.WeatherAppProject.Pojo.WeatherData;

import java.util.List;

public interface WeatherDataService {
    void save(WeatherData weatherData);
    List<WeatherData> findAll();
    WeatherData findById(Long id);
    void delete(WeatherData weatherData);
}
