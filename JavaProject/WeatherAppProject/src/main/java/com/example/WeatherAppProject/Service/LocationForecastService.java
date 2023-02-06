package com.example.WeatherAppProject.Service;

import com.example.WeatherAppProject.Pojo.LocationForecast;

import java.util.List;

public interface LocationForecastService {
    List<LocationForecast> findAll();

    LocationForecast findById(Long id);

    LocationForecast save(LocationForecast locationForecast);

    void delete(LocationForecast locationForecast);
}


