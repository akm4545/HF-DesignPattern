package chapter11.gumBall;

import java.rmi.Naming;

//프록시 패턴(Proxy Pattern)
//특정 객체로의 접근을 제어하는 대리인(특정 객체를 대변하는 객체)을 제공
//원격 프록시
//다른 JVM에 들어있는 객체의 대리인에 해당하는 로컬 객체
//프록시의 메소드를 호출하면 그 호출이 네트워크로 전달되어 결국 원격 객체의 메서드를 호출
//그 결과는 다시 프록시를 거쳐 클라이어언트에게 전달
public class GumballMachineTestDrive {
	public static void main(String[] args) {		
		GumballMachineRemote gumballMachine = null;
		int count;
		
		//매개변수가 부족하면 종료
		if(args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		//뽑기기계 초기화
		try {
			count = Integer.parseInt(args[1]);
			
			//뽑기 기계를 생성한 후 
			gumballMachine = new GumballMachine(args[0], count);
			
			//rmi 레지스트리에 해당 이름으로 해당 객체를 바인딩
			//이로써 클라이언트에서 해당 이름으로 해당 객체를 사용할 수 있다.
			//1. 리모트 인터페이스를 생성하고 클라이언트에서 사용할 메서드를 만든다.
			//2. 해당 리모트 인터페이스를 구현한 클래스를 생성하고 메서드를 적절히 구현한다.
			//3. 서버쪽에서 리모트 인터페이스를 구현한 클래스를 생성해서 리모트 인터페이스 타입의 필드에 저장한다
			//4. rmi 레지스트리에 바인딩 시켜 등록한다
			//5. 클라이언트에서 해당 이름으로 바인딩된 객체를 찾아 리모트 인터페이스의 메서드를 호출 가능하다.
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//모니터링 클래스에 뽑기기계 저장
//		GumballMonitor monitor = new GumballMonitor(gumballMachine);
//		
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//		
//		monitor.report();
	}
}
