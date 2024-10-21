package com.weather.monitoring.weather_monitoring.dto;

public class WeatherResponse {
	    private String cityName;
	    private String weatherDescription;
	    private double temperature;
	    private double humidity;
	    private double windSpeed;
		public double getTemperature() {
			return temperature;
		}
		public void setTemperature(double temperature) {
			this.temperature = temperature;
		}
		public String getWeatherDescription() {
			return weatherDescription;
		}
		public void setWeatherDescription(String weatherDescription) {
			this.weatherDescription = weatherDescription;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public double getWindSpeed() {
			return windSpeed;
		}
		public void setWindSpeed(double windSpeed) {
			this.windSpeed = windSpeed;
		}
		public double getHumidity() {
			return humidity;
		}
		public void setHumidity(double humidity) {
			this.humidity = humidity;
		}
}
