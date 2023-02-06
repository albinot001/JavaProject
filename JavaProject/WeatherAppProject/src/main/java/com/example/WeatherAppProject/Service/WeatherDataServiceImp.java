package com.example.WeatherAppProject.Service;

import com.example.WeatherAppProject.Pojo.WeatherData;
import com.example.WeatherAppProject.Repository.WeatherDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WeatherDataServiceImp implements WeatherDataService {

    private final WeatherDataRepository weatherDataRepository;

    @Autowired
    public WeatherDataServiceImp(WeatherDataRepository weatherDataRepository) {
        this.weatherDataRepository = weatherDataRepository;
    }

    @Override
    public void save(WeatherData weatherData) {
        weatherDataRepository.save(weatherData);
    }

    @Override
    public List<WeatherData> findAll() {
        return weatherDataRepository.findAll();
    }

    @Override
    public WeatherData findById(Long id) {
        return weatherDataRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(WeatherData weatherData) {
        weatherDataRepository.delete(weatherData);
    }
}

