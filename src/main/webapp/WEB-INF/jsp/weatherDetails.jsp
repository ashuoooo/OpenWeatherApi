<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Weather Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url(''); /* Add your weather-related background image URL */
            background-size: cover;
            background-position: center;
            color: #fff;
        }
        h1{
        color: black; /* Change this to a color that stands out against your background */
        font-size: 2.5em; /* Adjust the font size */
        text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.7); 
        }
        .card {
            background-color: rgba(0, 0, 0, 0.7);
            border: none;
            color: #fff;
            margin-bottom: 20px;
            text-align: center;
        }
        .weather-icon {
            width: 70px;
            height: 70px;
            margin-bottom: 30px;
        }
        .weather-info {
            font-size: 18px;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4 text-center">Weather Details for ${weather.cityName}</h1>
        
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <img src="https://cdn2.iconfinder.com/data/icons/weather-flat-14/64/weather02-512.png" alt="Temperature" class="weather-icon"> <!-- Predefined image for temperature -->
                        <p class="weather-info"><strong>Temperature:</strong> ${weather.temperature}°C</p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <img src="https://cdn2.iconfinder.com/data/icons/weather-flat-14/64/weather02-512.png" alt="Feels Like" class="weather-icon"> <!-- Predefined image for feels like -->
                        <p class="weather-info"><strong>Feels Like:</strong> ${weather.feelsLike}°C</p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <img src="https://cdn2.iconfinder.com/data/icons/weather-flat-14/64/weather02-512.png" alt="Humidity" class="weather-icon"> <!-- Predefined image for humidity -->
                        <p class="weather-info"><strong>Humidity:</strong> ${weather.humidity}%</p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <img src="https://cdn2.iconfinder.com/data/icons/weather-flat-14/64/weather02-512.png" alt="Wind Speed" class="weather-icon"> <!-- Predefined image for wind speed -->
                        <p class="weather-info"><strong>Wind Speed:</strong> ${weather.windSpeed} m/s</p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <img src="https://cdn2.iconfinder.com/data/icons/weather-flat-14/64/weather02-512.png" alt="Pressure" class="weather-icon"> <!-- Predefined image for pressure -->
                        <p class="weather-info"><strong>Pressure:</strong> ${weather.pressure} hPa</p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <img src="https://cdn2.iconfinder.com/data/icons/weather-flat-14/64/weather02-512.png" alt="Visibility" class="weather-icon"> <!-- Predefined image for visibility -->
                        <p class="weather-info"><strong>Visibility:</strong> ${weather.visibility} meters</p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <img src="https://cdn2.iconfinder.com/data/icons/weather-flat-14/64/weather02-512.png" alt="Weather Description" class="weather-icon"> <!-- Predefined image for weather description -->
                        <p class="weather-info"><strong>Weather Description:</strong> ${weather.weatherDescription}</p>
                    </div>
                </div>
            </div>
        </div>

        <div class="text-center">
            <a href="${pageContext.request.contextPath}/" class="btn btn-primary mt-3">Back to Search</a>
        </div>
    </div>
</body>
</html>
