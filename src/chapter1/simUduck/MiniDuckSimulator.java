package chapter1.simUduck;

import chapter1.simUduck.behaviro.fly.FlyRocketPowered;
import chapter1.simUduck.duck.Duck;
import chapter1.simUduck.duck.MallardDuck;
import chapter1.simUduck.duck.ModelDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		//청둥오리 클래스를 생성
		Duck mallard = new MallardDuck();
		
		//행동 인터페이스에 할당되어 있는 구현 클래스의 행동을 실행
		mallard.performFly();
		mallard.performQuack();
		
		//다형성을 이용하여 자식 클래스를 부모 클래스의 자료형으로 만듦
		Duck model = new ModelDuck();
		
		model.performFly();
		
		//setter를 이용하여 나는 행동을 동적으로 변경
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
