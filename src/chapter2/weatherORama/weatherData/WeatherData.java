package chapter2.weatherORama.weatherData;

import java.util.ArrayList;
import java.util.List;

import chapter2.weatherORama.observer.Observer;
import chapter2.weatherORama.subject.Subject;

public class WeatherData implements Subject{
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
	}
	
	public void measurementsChange() {
		
	}
}
