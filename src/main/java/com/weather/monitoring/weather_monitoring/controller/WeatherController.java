 package com.weather.monitoring.weather_monitoring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.monitoring.weather_monitoring.dto.WeatherResponse;
import com.weather.monitoring.weather_monitoring.service.WeatherService;
import com.fasterxml.jackson.databind.ObjectMapper; // Make sure to import this for JSON conversion

@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @Autowired
    private ObjectMapper objectMapper; // Jackson ObjectMapper for converting JSON to Java objects

    @GetMapping("/{city}") // This allows for city names with spaces or special characters
    public ResponseEntity<WeatherResponse> getWeather(@PathVariable String city) {
        String weatherData = weatherService.getWeatherByCity(city);
        
        try {
            // Convert JSON string to WeatherResponse object
            WeatherResponse weatherResponse = objectMapper.readValue(weatherData, WeatherResponse.class);
            return new ResponseEntity<>(weatherResponse, HttpStatus.OK);
        } catch (Exception e) {
            // Handle JSON parsing exception
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}        