package chapter1.simUduck.duck;

import chapter1.simUduck.behaviro.fly.FlyBehavior;
import chapter1.simUduck.behaviro.quack.QuackBehavior;

//여러 오리의 공통적인 부분을 재사용 하기 위해 추상 클래스로 선언 후 상속받아 사용
public abstract class Duck {
	
	//오리의 종류마다 바뀌는 행동을 정의한 인터페이스
	//해당 인터페이스를 오리의 종류에 맞게 적절하게 구현한 클래스로 받아 사용할 목적
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	
	//동적으로 나는 행동을 바꾸기 위해 추가
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	//동적으로 우는 행동을 바꾸기 위해 추가
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	//오리의 모습을 자식 클래스가 적절히 구현
	public abstract void display();
	
	//위의 나는 행동을 구현한 클래스에게 위임
	public void performFly() {
		flyBehavior.fly();
	}
	
	//위의 소리내는 행동을 구현한 클래스에게 위임	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	//바뀌지 않을 공통부분
	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}
}
