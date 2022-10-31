package chapter2.weatherORama;

import chapter2.weatherORama.display.CurrentConditionDisplay;
import chapter2.weatherORama.weatherData.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
