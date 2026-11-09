package headfirst.designpatterns.observer.weather;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		WeatherTodayDisplay weatherTodayDisplay =
    new WeatherTodayDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(62, 90, 28.1f);
		// Tests the Weather Today display with wind, dew point, and UV index.
		weatherData.setMeasurements(80, 65, 30.4f, 12, 67, 6);
		weatherData.setMeasurements(82, 70, 29.2f, 18, 71, 8);
		weatherData.setMeasurements(78, 90, 29.2f, 8, 75, 3);
	}
}
