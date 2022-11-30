package chapter10.gumBall;

//상태 패턴(State Pattern)
//객체의 내부 상태가 바뀜에 따라서 객체의 행동을 바꿀 수 있다.
//마치 객체의 클래스가 바뀌는 것과 같은 결과를 얻을 수 있다.
public class GumballMachineTestDrive {
	public static void main(String[] args) {
		//기계에 알맹이를 5개 넣음
		GumballMachine gumballMachine = new GumballMachine(5);
		
		//상태 출력
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuarter();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}
}
