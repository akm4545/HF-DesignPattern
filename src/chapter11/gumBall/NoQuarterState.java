package chapter11.gumBall;

//상태를 구현한 클래스
public class NoQuarterState implements State{
	private static final long serialVerseionUID = 2L;
	
	//뽑기 기계
	transient GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	//동전을 넣는 메서드
	@Override
	public void insertQuarter() {
		System.out.println("동전을 넣으셨습니다.");
		
		//기계의 상태를 동전을 넣은 상태로 바꾼다
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	//기타 동전이 없을 때 해당 행동을 취하면 상태 클래스에 맞는 행동을 취함
	@Override
	public void ejectQuarter() {
		System.out.println("동전을 넣어 주세요.");
	}

	@Override
	public void turnCrank() {
		System.out.println("동전을 넣어 주세요.");
	}

	@Override
	public void dispense() {
		System.out.println("동전을 넣어 주세요.");
	}

	@Override
	public void refill() {
		
	}
}
