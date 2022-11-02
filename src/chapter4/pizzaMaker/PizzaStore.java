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
	 
	public abstract Pizza createPizza(String item);
 
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

