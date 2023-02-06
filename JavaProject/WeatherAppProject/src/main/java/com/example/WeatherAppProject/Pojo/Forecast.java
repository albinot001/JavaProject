package com.example.WeatherAppProject.Pojo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Forecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "minTemperature")
    private double minTemperature;

    @Column(name = "maxTemperature")
    private double maxTemperature;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @Column(name = "ForecastTemperature")
    private Double ForecastTemperature;

    @Column(name = "ForecastPrecipitation")
    private Double ForecastPrecipitation;

    @Column(name = "ForecastWindSpeed")
    private Double ForecastWindSpeed;

    @Column(name = "ForecastHumidity")
    private Double ForecastHumidity;


    public Forecast(Long id, LocalDate date, double minTemperature, double maxTemperature, Location location, Double forecastTemperature, Double forecastPrecipitation, Double forecastWindSpeed, Double forecastHumidity) {
        this.id = id;
        this.date = date;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.location = location;
        ForecastTemperature = forecastTemperature;
        ForecastPrecipitation = forecastPrecipitation;
        ForecastWindSpeed = forecastWindSpeed;
        ForecastHumidity = forecastHumidity;
    }

    public Forecast() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Double getForecastTemperature() {
        return ForecastTemperature;
    }

    public void setForecastTemperature(Double forecastTemperature) {
        ForecastTemperature = forecastTemperature;
    }

    public Double getForecastPrecipitation() {
        return ForecastPrecipitation;
    }

    public void setForecastPrecipitation(Double forecastPrecipitation) {
        ForecastPrecipitation = forecastPrecipitation;
    }

    public Double getForecastWindSpeed() {
        return ForecastWindSpeed;
    }

    public void setForecastWindSpeed(Double forecastWindSpeed) {
        ForecastWindSpeed = forecastWindSpeed;
    }

    public Double getForecastHumidity() {
        return ForecastHumidity;
    }

    public void setForecastHumidity(Double forecastHumidity) {
        ForecastHumidity = forecastHumidity;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "id=" + id +
                ", date=" + date +
                ", minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                ", location=" + location +
                ", ForecastTemperature=" + ForecastTemperature +
                ", ForecastPrecipitation=" + ForecastPrecipitation +
                ", ForecastWindSpeed=" + ForecastWindSpeed +
                ", ForecastHumidity=" + ForecastHumidity +
                '}';
    }
}
