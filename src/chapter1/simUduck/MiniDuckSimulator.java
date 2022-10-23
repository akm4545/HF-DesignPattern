package chapter1.simUduck;

import chapter1.simUduck.duck.Duck;
import chapter1.simUduck.duck.MallardDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		//청둥오리 클래스를 생성
		Duck mallard = new MallardDuck();
		
		//행동 인터페이스에 할당되어 있는 구현 클래스의 행동을 실행
		mallard.performFly();
		mallard.performQuack();
	}
}
