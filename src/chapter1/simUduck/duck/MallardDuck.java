package chapter1.simUduck.duck;

import chapter1.simUduck.behaviro.fly.FlyWithWings;
import chapter1.simUduck.behaviro.quack.Quack;

//오리의 행동을 정의한 duck 추상클래스를 상속 받아 청둥오리 클래스를 생성
public class MallardDuck extends Duck{
	
	//기본 생성자 -> 청둥오리의 행동들을 구현한 클래스를 부모 클래스의 변수에 할당
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("저는 물오리입니다.");
	}
}
