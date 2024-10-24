document.getElementById('fetchWeatherBtn').addEventListener('click', function () {
    const city = document.getElementById('cityInput').value;
    
    if (city) {
        fetch(`/weather/${city}`)
            .then(response => response.json())
            .then(data => {
                // Save data to localStorage
                localStorage.setItem('weatherData', JSON.stringify(data));
                // Redirect to weather.html
                window.location.href = 'weather.html';
            })
            .catch(error => {
                console.error('Error fetching weather data:', error);
            });
    } else {
        alert('Please enter a city name');
    }
});
window.addEventListener('DOMContentLoaded', function () {
    const weatherData = JSON.parse(localStorage.getItem('weatherData'));

    if (weatherData) {
        document.getElementById('cityName').textContent = weatherData.cityName;
        document.getElementById('weatherDescription').textContent = weatherData.weatherDescription;
        document.getElementById('temperature').textContent = weatherData.temperature.toFixed(1);
        document.getElementById('humidity').textContent = weatherData.humidity;
        document.getElementById('windSpeed').textContent = weatherData.windSpeed;
    } else {
        alert('Weather data not found');
    }
});
