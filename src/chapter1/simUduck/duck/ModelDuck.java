package chapter1.simUduck.duck;

import chapter1.simUduck.behaviro.fly.FlyNoWay;
import chapter1.simUduck.behaviro.quack.Quack;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("저는 모형 오리입니다.");
	}
}
