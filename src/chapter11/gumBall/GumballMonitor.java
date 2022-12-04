package chapter11.gumBall;

//새로 추가된 뽑기기계 모니터링 클래스
public class GumballMonitor {
	GumballMachine machine;
	
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}
	
	public void report() {
		System.out.println("뽑기 기계 위치: " + machine.getLocation());
		System.out.println("현재 재고: " + machine.getCount() + " 개");
		System.out.println("현재 상태: " + machine.getState());
	}  
}
