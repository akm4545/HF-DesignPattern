package chapter2.weatherORama.subject;

import chapter2.weatherORama.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
