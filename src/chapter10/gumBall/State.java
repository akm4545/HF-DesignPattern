package chapter10.gumBall;

//상태를 구현할 클래스가 구현해야할 인터페이스
public interface State {
	//뽑기 기계에서 일어날 수 있는 모든 행동에 직접적으로 대응되는 메소드들
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
	public void refill();
}
