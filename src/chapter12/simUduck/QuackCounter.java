package chapter12.simUduck;

public class QuackCounter implements Quackable{
	Quackable duck;
	static int numberOfQuacks;
	Observable observable;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
