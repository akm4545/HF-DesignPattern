package chapter11.gumBall;

public class WinnerState implements State{
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}

	@Override
	public void turnCrank() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else {
			gumballMachine.releaseBall();
			System.out.println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.");
			
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else {
				System.out.println("더 이상 알맹이가 없습니다.");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}
	
}
