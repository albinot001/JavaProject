### WeatherApp Java-Spring
 
### Introduction:
Welcome to our weather app, a simple application built using Java and Spring Boot that allows you to retrieve weather information for a specific location. This document will provide an overview of the app, how to get started, and how to use the features.

### Requirements:
- Java 11 or higher
- Spring Boot 2.7.8 or higher 
- MySQL
- Spring JPA
- Spring Web
- MySQL Driver
- Junit 4.4
- Insomnia or a similar REST client

### WeatherData:
GET /api/weatherdata: Retrieve a list of all WeatherDate objects.
GET /api/weatherdata/{id}: Retrieve the WeatherDate object with the specified id.
POST /api/weatherdata: Add a new WeatherDate object.
PUT /api/weatherdata/{id}: Update the WeatherDate object with the specified id.
DELETE /api/weatherdata/{id}: Delete the WeatherDate object with the specified id

### Location 
GET /api/location: Retrieve a list of all Location objects.
GET /api/location/{id}: Retrieve the Location object with the specified id.
POST /api/location: Add a new Location object.
PUT /api/location/{id}: Update the Location object with the specified id.
DELETE /api/location/{id}: Delete the Location object with the specified id.

### Forecast
GET /api/forecast: Retrieve a list of all Forecast objects.
GET /api/forecast/{id}: Retrieve the Forecast object with the specified id.
POST /api/forecast: Add a new Forecast object.
PUT /api/forecast/{id}: Update the Forecast object with the specified id.
DELETE /api/forecast/{id}: Delete the Forecast object with the specified id.

### LocationForecast
GET /api/locationforecast: Retrieve a list of all LocationForecast objects.
GET /api/locationforecast/{id}: Retrieve the LocationForecast object with the specified id.
POST /api/locationforecast: Add a new LocationForecast object.
PUT /api/locationforecast/{id}: Update the LocationForecast object with the specified id.
DELETE /api/locationforecast/{id}: Delete the LocationForecast object with the specified id.

### Conclusion
We hope that this weather app will be useful for you. If you have any questions or comments, please feel free to reach out to us. Thank you for using our app!