package com.example.WeatherAppProject.Service;

import com.example.WeatherAppProject.Pojo.LocationForecast;
import com.example.WeatherAppProject.Repository.LocationForecastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocationForecastServiceImp implements LocationForecastService {

    private final LocationForecastRepository locationForecastRepository;

    @Autowired
    public LocationForecastServiceImp(LocationForecastRepository locationForecastRepository) {
        this.locationForecastRepository = locationForecastRepository;
    }

    @Override
    public List<LocationForecast> findAll() {
        return locationForecastRepository.findAll();
    }

    @Override
    public LocationForecast findById(Long id) {
        return locationForecastRepository.findById(id).orElse(null);
    }

    @Override
    public LocationForecast save(LocationForecast locationForecast) {
        return locationForecastRepository.save(locationForecast);
    }

    @Override
    public void delete(LocationForecast locationForecast) {
        locationForecastRepository.delete(locationForecast);
    }
}

