package chapter1.simUduck.behaviro.quack;

//우는 행동을 정의한 인터페이스를 실제 우는 행위로 구현
public class Quack implements QuackBehavior{	
	@Override
	public void quack() {
		System.out.println("꽥");
		
	}
}
