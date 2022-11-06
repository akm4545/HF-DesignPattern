package chapter4.pizzaMaker;

//public class PizzaStore {
//	//팩토리 클래스에 객체 생성을 위임
//	SimplePizzaFactory factory;
//	
//	//생성자에 팩토리를 전달하여 저장
//	public PizzaStore(SimplePizzaFactory fecFactory) {
//		this.factory = factory;
//	}
//	
//	//타입을 받아 팩토리에서 객체를 생성
//	Pizza orderPizza(String type) {
//		Pizza pizza;
//		
//		pizza = factory.createPizza(type);
//		
//		pizza.prepare();
//		pizza.bake();
//		pizza.cut();
//		pizza.box();
//		
//		return pizza;
//	}
//}

public abstract class PizzaStore {
	
	//추상 메소드로 선언하여 서브클래스가 객체 생성을 책임지도록 함
	//특정 객체를 리턴하며 그 객체는 보통 슈퍼클래스가 정의한 메서드 내에서 쓰임
	//팩토리 메소드는 실제로 생성되는 구상 객체가 무엇인지 알 수 없게 만드는 역할도 함
	//매개변수로 만들 객체 종류를 선택할 수도 있음
	public abstract Pizza createPizza(String item);
 
	//피자 객체를 만드는 일은 PizzaStore의 서브클래스의 메소드에서 처리
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		System.out.println("--- Making a " + pizza.getName() + " ---");
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}

