package chapter2.weatherORama.display;

import chapter2.weatherORama.observer.Observer;
import chapter2.weatherORama.weatherData.WeatherData;

//디스플레이로 사용할 객체 -> 옵저버와 디스플레이의 공통 부분을 구현
public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	//생성자에 subject를 구현한 weatherData를 전달하여 옵저버로 등록 
	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	//display 출력부
	@Override
	public void display() {
		System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
	}

	//변경사항을 받을 update메서드
	//값을 받아 적절히 처리한다 (push 방식 : subject -> observer)
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	//변경사항을 받을 update메서드
	//값을 받아 적절히 처리한다 (pull 방식 : observer -> subject)
//	@Override
//	public void update() {
//		this.temperature = weatherData.getTemperature();
//		this.humidity = weatherData.getHumidity();
//		display();
//	}
}
