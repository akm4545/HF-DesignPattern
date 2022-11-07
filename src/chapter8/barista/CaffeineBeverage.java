package chapter8.barista;

//Coffee 클래스와 Tea 클래스가 공통으로 사용하는 메서드를 분리
public abstract class CaffeineBeverage {
	
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	//공통이 아닌 부분은 서브 클래스에서 정의하도록 함
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("물 끓이는 중");
	}
	
	void pourInCup() {
		System.out.println("컵에 따르는 중");
	}
}
