package com.weather.monitoring.weather_monitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weather.monitoring.weather_monitoring.model.Weather;

public interface WeatherRepository extends JpaRepository<Weather ,Long>{

}
