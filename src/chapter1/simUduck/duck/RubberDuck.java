package chapter1.simUduck.duck;

import chapter1.simUduck.behaviro.fly.FlyNoWay;
import chapter1.simUduck.behaviro.quack.Squeak;

//고무오리 - 공부용
//해당 방식으로 만들지 않고 청둥오리와 고무오리를 나눠 클래스를 만들었다면 코드의 중복이 발생하고 수정도 어려움
//공통 부분을 부모 클래스로 만들어 상속하더라도 나는행동, 우는행동이 같지 않아 해당 부분을 오버라이드 해야하는 점이 생김 
public class RubberDuck extends Duck{

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("고무오리입니다.");
	}
}
