package com.weather.monitoring.weather_monitoring.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.weather.monitoring.weather_monitoring.dto.WeatherResponse;
import com.weather.monitoring.weather_monitoring.model.Weather;
import com.weather.monitoring.weather_monitoring.repository.FavoriteCityRepository;
import com.weather.monitoring.weather_monitoring.repository.WeatherRepository;
import com.weather.monitoring.weather_monitoring.service.WeatherService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private WeatherRepository weatherRepository;

    @Autowired
    private FavoriteCityRepository favoriteCityRepository;
    
    @GetMapping("/")
    public String showWeatherForm() {
        return "weather";
    }

    @PostMapping("/weather")
    public String getWeatherFromCityForm(@RequestParam("city") String city, Model model) {
        if (city == null || city.trim().isEmpty()) {
            model.addAttribute("error", "City name cannot be empty");
            return "error";
        }

      

  
        try {
            String weatherData = weatherService.getWeatherByCity(city.trim());
            JsonNode jsonNode = objectMapper.readTree(weatherData);
            WeatherResponse weatherResponse = new WeatherResponse();
            
            weatherResponse.setCityName(jsonNode.get("name").asText());
            weatherResponse.setWeatherDescription(jsonNode.get("weather").get(0).get("description").asText());
            weatherResponse.setTemperature(jsonNode.get("main").get("temp").asDouble());
            weatherResponse.setHumidity(jsonNode.get("main").get("humidity").asDouble());
            weatherResponse.setWindSpeed(jsonNode.get("wind").get("speed").asDouble());
         // Inside the getWeatherFromCityForm method
            weatherResponse.setFeelsLike(jsonNode.get("main").get("feels_like").asDouble());
            weatherResponse.setPressure(jsonNode.get("main").get("pressure").asDouble());
            weatherResponse.setVisibility(jsonNode.get("visibility").asDouble());
            
            Weather weather = new Weather();
            weather.setCity(city);
            weather.setTemperature(String.valueOf(weatherResponse.getTemperature()));
            weather.setHumidity(String.valueOf(weatherResponse.getHumidity()));
            weather.setDateTime(LocalDateTime.now());
            weatherRepository.save(weather);

            model.addAttribute("weather", weatherResponse);
            return "weatherDetails";
        } catch (Exception e) {
            model.addAttribute("error", "Unable to fetch weather details for " + city + ": " + e.getMessage());
            return "error";
        }
    }
}