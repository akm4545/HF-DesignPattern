package chapter4.pizzaMaker;

//간단한 팩토리(Simple Factory)
//디자인 패턴이라기 보다는 프로그래밍에서 자주 쓰이는 관용구에 가깝다.
//정확히는 패턴은 아니다.
public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(); 
		}else if(type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}else if(type.equals("clam")) {
			pizza = new ClamPizza();
		}else if(type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		
		return pizza;
	}
}
