package chapter11.gumBall;

import java.io.Serializable;

//상태를 구현할 클래스가 구현해야할 인터페이스
//state 인터페이스의 직렬화를 위해 serializable 상속
public interface State extends Serializable{
	//뽑기 기계에서 일어날 수 있는 모든 행동에 직접적으로 대응되는 메소드들
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
	public void refill();
}
