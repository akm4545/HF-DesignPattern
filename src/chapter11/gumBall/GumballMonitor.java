package chapter11.gumball;

//새로 추가된 뽑기기계 모니터링 클래스
public class GumballMonitor {
//	GumballMachine machine;
	//모니터링 클래스는 이제 원격으로 작동하기 때문에 remote를 구현한 클래스가 필요
	GumballMachineRemote machine;
	
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
	
	//네트워크를 통해 호출하므로 예외처리가 필요하다
	public void report() {
		try {
			System.out.println("뽑기 기계 위치: " + machine.getLocation());
			System.out.println("현재 재고: " + machine.getCount() + " 개");
			System.out.println("현재 상태: " + machine.getState());			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}  
}
