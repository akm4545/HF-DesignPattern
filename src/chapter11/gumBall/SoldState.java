package chapter11.gumball;

public class SoldState implements State{
	private static final long serialVerseionUID = 2L;
	
	transient GumballMachine gumballMachine;

	@Override
	public void insertQuarter() {
		System.out.println("알맹이를 내보내고 있습니다.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("이미 알맹이를 뽑으셨습니다.");
	}

	@Override
	public void turnCrank() {
		System.out.println("손잡이는 한 번만 돌려 주세요.");
	}

	@Override
	public void dispense() {
		//알맹이를 뽑고
		gumballMachine.releaseBall();
		
		//남은 알맹이의 갯수에 따라 상태를 결정한다.
		if(gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}
}
