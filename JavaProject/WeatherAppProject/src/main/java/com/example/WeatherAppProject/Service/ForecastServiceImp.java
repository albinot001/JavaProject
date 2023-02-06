package com.example.WeatherAppProject.Service;

import com.example.WeatherAppProject.Pojo.Forecast;
import com.example.WeatherAppProject.Repository.ForecastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ForecastServiceImp implements ForecastService {
    private final ForecastRepository forecastRepository;

    @Autowired
    public ForecastServiceImp(ForecastRepository forecastRepository) {
        this.forecastRepository = forecastRepository;
    }
    @Override
    public Forecast findById(Long id) {
        return forecastRepository.findById(id).orElse(null);
    }

    @Override
    public List<Forecast> findAll() {
        return forecastRepository.findAll();
    }

    @Override
    public Forecast save(Forecast forecast) {
        return forecastRepository.save(forecast);
    }

    @Override
    public Forecast update(Forecast forecast) {
        return forecastRepository.save(forecast);
    }

    @Override
    public void deleteById(Long id) {
        forecastRepository.deleteById(id);
    }
}
