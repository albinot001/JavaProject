package com.example.WeatherAppProject.Repository;

import com.example.WeatherAppProject.Pojo.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
