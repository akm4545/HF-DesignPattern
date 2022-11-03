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
	public static ChocolateBoiler getInstance() {
		if(chocolateBoiler == null) {
			chocolateBoiler = new ChocolateBoiler();
		}
		
		return chocolateBoiler;
	}
	
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
