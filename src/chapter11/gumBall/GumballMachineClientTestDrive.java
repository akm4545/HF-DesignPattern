package chapter11.gumball;

import java.rmi.Naming;

public class GumballMachineClientTestDrive {
	public static void main(String[] args) {
		//모니터링 할 뽑기기계 목록
		//바인딩된 이름
		String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
				"rmi://boulder.mightygumball.com/gumballmachine",
				"rmi://austin.mightygumball.com/gumballmachine"};
		
		//이름의 갯수만큼의 크기를 가진 모니터 배열 생성
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		
		for(int i=0; i<location.length; i++) {
			try {
				//바인딩된 객체를 찾아 가져온다
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
				//모니터링 객체에게 저장
				//GumballMachineRemote 인터페이스가 GumballMachine의 접근을 대신 전달하므로 프록시 객체임 
				monitor[i] = new GumballMonitor(machine);
				
				System.out.println(monitor[i]);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<monitor.length; i++) {
			//rmi에서 가져온 객체의 메서드 실행
			monitor[i].report();
		}
	}
}
