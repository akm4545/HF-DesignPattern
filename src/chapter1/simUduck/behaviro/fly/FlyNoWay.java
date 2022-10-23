package chapter1.simUduck.behaviro.fly;

//나는 행동을 정의한 인터페이스를 실제 날 수 없는 행위로 구현
public class FlyNoWay implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("저는 못 날아요");
	}
}
