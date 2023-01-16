package chapter12.simUduck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable{
	List<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		
		while(iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		
		while(iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}

	@Override
	public void notifyObservers() {
		
	}
}
