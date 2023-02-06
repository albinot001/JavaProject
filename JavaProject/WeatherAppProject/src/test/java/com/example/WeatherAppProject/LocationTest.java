package com.example.WeatherAppProject;


import com.example.WeatherAppProject.Pojo.Location;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {
    @Test
    public void testGettersAndSetters() {
        Location location = new Location();
        location.setId(1L);
        location.setCity("New York");
        location.setCountry("United States");
        location.setLongitude(40.7128);
        location.setLatitude(-74.0060);

        assertEquals(Long.valueOf(1L), location.getId());
        assertEquals("New York", location.getCity());
        assertEquals("United States", location.getCountry());
        assertEquals(40.7128, location.getLongitude(), 0.0001);
        assertEquals(-74.0060, location.getLatitude(), 0.0001);
    }

    @Test
    public void testConstructor() {
        Location location = new Location("London", "United Kingdom", 51.5074, -0.1278);

        assertEquals("London", location.getCity());
        assertEquals("United Kingdom", location.getCountry());
        assertEquals(51.5074, location.getLongitude(), 0.0001);
        assertEquals(-0.1278, location.getLatitude(), 0.0001);
    }
}