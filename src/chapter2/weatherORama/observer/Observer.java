package chapter2.weatherORama.observer;

//변경정보를 전달받을 옵저버 인터페이스
//모든 옵저버 클래스에서 구현해야함 따라서 모든 옵저버는 update를 구현해야함
public interface Observer {
	//기상 정보가 변경되었을 시 상태값을 전달
	public void update(float temp, float humidity, float pressure);
}
