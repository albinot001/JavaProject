package com.example.WeatherAppProject.Service;

import com.example.WeatherAppProject.Pojo.Location;

import java.util.List;

public interface LocationService {
    Location findById(Long id);
    List<Location> findAll();
    Location save(Location location);
    Location update(Location location);
    void deleteById(Long id);
}
