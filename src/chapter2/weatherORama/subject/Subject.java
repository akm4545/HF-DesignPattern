package chapter2.weatherORama.subject;

import chapter2.weatherORama.observer.Observer;

//옵저버를 등록하고 제거하고 변경 내용을 알리는 인터페이스
public interface Subject {
	//옵저버를 등록한다
	public void registerObserver(Observer o);
	
	//옵저버를 제거한다
	public void removeObserver(Observer o);
	
	//변경사항을 알린다
	public void notifyObserver();
}
