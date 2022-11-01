package chapter2.weatherORama;

import chapter2.weatherORama.display.CurrentConditionDisplay;
import chapter2.weatherORama.display.HeatIndexDisplay;
import chapter2.weatherORama.weatherData.WeatherData;

//옵저버 패턴 (Observer pattern)
//한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 
//자동으로 내용이 갱신되는 방식으로 일대다(one-to-many)의존성을 가짐
public class WeatherStation {
	public static void main(String[] args) {
		//subject를 구현한 weatherData객체를 생성 
		WeatherData weatherData = new WeatherData();
		
		//display를 생성하면서 subject를 구현한 weatherData를 넘겨 observer로 등록 
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		//weatherData에 값을 변경하면 등록된 observer들이 구현한 update메소드를 호출하여 알림
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}
