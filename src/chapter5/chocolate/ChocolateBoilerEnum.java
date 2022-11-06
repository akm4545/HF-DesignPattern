package chapter5.chocolate;

//enum 타입은 기본적으로 직렬화 가능하므로 Serializable 인터페이스를 구현할 필요가 없고, 리플렉션 문제도 발생하지 않는다
//인스턴스가 JVM 내에 하나만 존재한다는 것이 100% 보장 되므로 Java에서 싱글톤을 만드는 가장 좋은 방법으로 권장된다 
public enum ChocolateBoilerEnum {
	CHOCOLATEBOILER;
	private boolean empty;
	private boolean boiled;
	
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
