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

	//변경사항을 알림
	//옵저버 인터페이스를 구현한 클래스의 update를 호출 (push방식: subject -> observer)
	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	//옵저버 인터페이스를 구현한 클래스의 update를 호출 (pull방식: observer -> subject)
//	@Override
//	public void notifyObserver() {
//		for(Observer observer : observers) {
//			observer.update();
//		}
//	}
	
	//가상 스테이션의 갱신된 측정값을 받으면 옵저버들에게 알림
	public void measurementsChange() {
		notifyObserver();
	}
	
	//받아온 값을 weatherData에 저장하는 부분
	public void setMeasurements(float temperature, float humidity, float pressure) {
		//저장하고
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		//옵저버들에게 알림
		measurementsChange();
	}
	
	//pull 방식에서 사용할 getter메소드
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
