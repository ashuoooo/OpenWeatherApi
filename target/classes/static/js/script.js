document.getElementById('fetchWeatherBtn').addEventListener('click', function() {
    const city = document.getElementById('cityInput').value;
    fetch(`http://localhost:8080/weather/${city}`)
        .then(response => response.json())
        .then(data => {
            displayWeather(data);
        })
        .catch(error => console.error('Error fetching weather data:', error));
});

function displayWeather(data) {
    const weatherResult = document.getElementById('weatherResult');
    weatherResult.innerHTML = `
        <h2>Weather in ${data.name}</h2>
        <p>Description: ${data.weather[0].description}</p>
        <p>Temperature: ${(data.main.temp - 273.15).toFixed(2)} °C</p>
        <p>Humidity: ${data.main.humidity}%</p>
        <p>Wind Speed: ${data.wind.speed} m/s</p>
    `;
}
