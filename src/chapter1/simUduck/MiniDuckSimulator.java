package chapter1.simUduck;

import chapter1.simUduck.behaviro.fly.FlyRocketPowered;
import chapter1.simUduck.duck.Duck;
import chapter1.simUduck.duck.MallardDuck;
import chapter1.simUduck.duck.ModelDuck;

//전략 패턴(Strategy Pattern)
//알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해준다.
//전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있다.
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
