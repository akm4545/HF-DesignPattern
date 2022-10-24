package chapter1.simUduck.duck;

import chapter1.simUduck.behaviro.quack.Quack;
import chapter1.simUduck.behaviro.quack.QuackBehavior;

//사냥꾼들이 오리 소리(꽥꽥 소리)를 내려고 사용하는 오리 호출기가 있다고 가정해 봅시다.
//어떻게 하면 Duck 클레스를 상속받지 않고 오리 호출기를 구현할 수 있을까요?
public class DuckPager {
	private QuackBehavior quackBehavior;
	
	public DuckPager() {
		quackBehavior = new Quack(); 
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
}
