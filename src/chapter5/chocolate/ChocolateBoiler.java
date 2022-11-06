package chapter5.chocolate;

//싱글턴 패턴(Singleton Pattern) 
//클래스 인스턴스를 하나만 만드록 그 인스턴스로의 전역 접근을 제공
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	//외부에서 직접 접근이 불가능한 정적 변수를 만든다
	private static ChocolateBoiler chocolateBoiler;
	
//	ChocolateBoiler() {
//		empty = true;
//		boiled = false;
//	}
	
	//생성자가 외부 접근이 불가능 하므로 new 키워드를 사용하여 인스턴스를 생성 할 수 없다
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	//public 정적 메소드로 만들어 어디서든 호출 가능한 메서드를 만들어 
	//인스턴스가 존재하지 않는다면 새 인스턴스를 반환하고 아니면 기존에 생성된 인스턴스를 반환
	//필요할 때 로드할 수 있는 lazy 방식
//	public static ChocolateBoiler getInstance() {
//		if(chocolateBoiler == null) {
//			chocolateBoiler = new ChocolateBoiler();
//		}
//		
//		return chocolateBoiler;
//	}
	
	//멀티스레드 환경에서 동시에 호출했을 시 인스턴스가 2개가 생성되는 문제를 해결하기 위해
	//synchronized키워드를 추가 (먼저 실행한 쓰레드의 작업이 끝날때까지 대기)
	public static synchronized ChocolateBoiler getInstance() {
		if(chocolateBoiler == null) {
			chocolateBoiler = new ChocolateBoiler();
		}
		
		return chocolateBoiler;
	}
	
	//혹은 처음부터 생성시켜 놓는 방법도 있다
//	private static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
//	
//	public static ChocolateBoiler getInstance() {
//		return chocolateBoiler;
//	}
	
	//DCL(Double-Checked Locking)을 사용하여 인스턴스가 생성되어 있는지 
	//확인한 다음 생성되어 있지 않았을 때만 동기화 할 수 있다.
	//volatile -> 메인 메모리에서 작업을 하므로 가시성 보장
	//private volatile static ChocolateBoiler chocolateBoiler; 
	
	//맨 위에 메소드를 동기화 시켰을 경우 인스턴스를 가져올때 성능 저하가 일어나지만
	//아래화 같이 생성시에만 동기화 시키면 매번 가져올때 성능 저하가 일어나지 않는다
//	public static ChocolateBoiler getInstance() {
//		if(chocolateBoiler == null) {
			//동기화 블록 -> 한 쓰레드가 작업이 끝날 때 까지 다른 쓰레드는 해당 블록을 실행하지 못한다 
			//같은 모니터 객체를 기준으로 동기화된 블록 안의 코드를 오직 한 쓰레드만이 실행할 수 있다
//			synchronized (ChocolateBoiler.class) {
//				if(chocolateBoiler == null) {
//					chocolateBoiler = new ChocolateBoiler();
//				}
//			}
//		}
//		
//		return chocolateBoiler;
//	}
	
	
	public void fill() {
		if(isEmpty()){
			empty = false;
			boiled = false;
			//보일러에 우유와 초콜릿을 혼합한 재료를 넣음
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			//끓인 재료를 다음 단계로 넘김
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			//재료를 끓임
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
