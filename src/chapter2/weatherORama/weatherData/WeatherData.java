package chapter2.weatherORama.weatherData;

import java.util.ArrayList;
import java.util.List;

import chapter2.weatherORama.observer.Observer;
import chapter2.weatherORama.subject.Subject;

//옵저버 패턴을 구현할 서브젝트 객체
public class WeatherData implements Subject{
	//옵저버들을 저장할 List
	private List<Observer> observers;
	
	//변경될 값
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	//옵저버 등록
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	//옵저버 삭제
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChange() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChange();
	}
}
