package chapter11.gumBall;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		int count = 0;
		
		//매개변수가 부족하면 종료
		if(args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		//뽑기기계 초기화
		count = Integer.parseInt(args[1]);
		GumballMachine gumballMachine = new GumballMachine(args[0], count);
		
		//모니터링 클래스에 뽑기기계 저장
		GumballMonitor monitor = new GumballMonitor(gumballMachine);
		
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		monitor.report();
	}
}
