package com.example.WeatherAppProject.Repository;

import com.example.WeatherAppProject.Pojo.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherDataRepository extends JpaRepository<WeatherData, Long> {

}

