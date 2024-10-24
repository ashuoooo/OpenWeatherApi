package com.weather.monitoring.weather_monitoring.dto;

public class WeatherResponse {
    private String cityName;
    private String weatherDescription;
    private double temperature;
    private double humidity;
    private double windSpeed;
    private double feelsLike;
    private double pressure;
    private double visibility;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}
	public double getFeelsLike() {
		return feelsLike;
	}
	public void setFeelsLike(double feelsLike) {
		this.feelsLike = feelsLike;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getVisibility() {
		return visibility;
	}
	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}

   
}