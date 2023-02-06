package com.example.WeatherAppProject.Pojo;

import javax.persistence.*;

@Entity
public class LocationForecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "forecast_id")
    private Forecast forecast;

    public LocationForecast() {}

    public LocationForecast(Location location, Forecast forecast) {
        this.location = location;
        this.forecast = forecast;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return "LocationForecast{" +
                "id=" + id +
                ", location=" + location +
                ", forecast=" + forecast +
                '}';
    }
}


