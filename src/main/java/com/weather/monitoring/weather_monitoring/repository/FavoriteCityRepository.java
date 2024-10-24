package com.weather.monitoring.weather_monitoring.repository;

import com.weather.monitoring.weather_monitoring.model.FavoriteCity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteCityRepository extends JpaRepository<FavoriteCity, Long> {
    boolean existsByCityName(String cityName);
}