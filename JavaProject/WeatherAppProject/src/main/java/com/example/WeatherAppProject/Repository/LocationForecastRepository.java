package com.example.WeatherAppProject.Repository;

import com.example.WeatherAppProject.Pojo.LocationForecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationForecastRepository extends JpaRepository<LocationForecast, Long> {

}

