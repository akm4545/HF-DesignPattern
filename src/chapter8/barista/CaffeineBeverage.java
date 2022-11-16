package chapter8.barista;

//Coffee 클래스와 Tea 클래스가 공통으로 사용하는 메서드를 분리

//템플릿 메소드 패턴(Template Method Pattern)
//알고리즘의 골격을 정의
//템플릿 메소드를 사용하면 알고리즘의 일부 단계를 서브클래스에서 구현할 수 있다.
//알고리즘의 구조는 그대로 유지하면서 알고리즘의 특정 단계를 서브클래스에서 재정의할 수도 있다.
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
