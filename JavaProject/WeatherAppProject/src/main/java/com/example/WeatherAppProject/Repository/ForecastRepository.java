package com.example.WeatherAppProject.Repository;

import com.example.WeatherAppProject.Pojo.Forecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForecastRepository extends JpaRepository<Forecast, Long> {

}
