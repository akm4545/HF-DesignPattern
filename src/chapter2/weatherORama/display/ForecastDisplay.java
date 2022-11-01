package chapter2.weatherORama.display;

import chapter2.weatherORama.observer.Observer;
import chapter2.weatherORama.weatherData.WeatherData;

public class ForecastDisplay implements DisplayElement, Observer{
	private float currentPressure = 29.9f;
	private float lastPressure;
	private WeatherData weatherData; 
	
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		//디스플레이 코드
	}
	
	public void update() {
		lastPressure = currentPressure;
		currentPressure = weatherData.getPressure();
		display();
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
	}
}
