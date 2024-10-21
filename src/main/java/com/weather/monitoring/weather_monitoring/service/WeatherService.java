package com.weather.monitoring.weather_monitoring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	
	private static final String API_URL="https://api.openweathermap.org/data/2.5/weather?q={city}&appid={API_KEY}";
	
	 private static final String API_KEY = "4639096e898c8d777be50ea029653573";
	 
	 public String getWeatherByCity(String city) {
		        RestTemplate restTemplate = new RestTemplate();
		        String result = restTemplate.getForObject(API_URL, String.class, city, API_KEY);
		        return result;
		   
	 }
}
