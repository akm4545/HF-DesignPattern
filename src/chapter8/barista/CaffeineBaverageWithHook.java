package chapter8.barista;

public abstract class CaffeineBaverageWithHook {
	
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		
		//후크 사용
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		
	}
	
	void pourInCup() {
		
	}
	
	//후크(hook) 
	//추상 클래스에서 선언되지만 기본적인 내용만 구현되어 있거나 아무 코드도 들어있지 않은 메소드
	//서브클래스는 다양한 위치에서 알고리즘에 끼어들 수 있다 
	boolean customerWantsCondiments() {
		return true;
	}
}
