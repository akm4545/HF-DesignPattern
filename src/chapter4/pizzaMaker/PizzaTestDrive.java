package chapter4.pizzaMaker;

import chapter4.pizzaMaker.NYPizza.NYPizzaStore;
import chapter4.pizzaMaker.chicagoPizza.ChicagoPizzaStore;

//팩토리 메소드 패턴(Factory Method Pattern)
//객체를 생성할 때 필요한 인터페이스를 만든다.
//어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정한다.
//팩토리 메소드 패턴을 사용하면 클래스 인스턴스 만드는 일을 서브클래스에게 맡기게 된다.

//추상 팩토리 패턴(Abstract Factory Pattern)
//구상 클래스에 의존하지 않고도 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생산하는 인터페이스를 제공
//구상 클래스는 서브클래스에서 만든다.
public class PizzaTestDrive {
	public static void main(String[] args) {
		//팩토리들 
		//제품으로 원하는 일을 할 때 필요한 메소드가 구현되어 있다
		//제품을 만드는 메소드는 추상 메소드로 정의되어 서브 클래스에서 적절히 구현해야 한다
		//구상 클래스를 만드는 일은 팩토리 인터페이스를 자신에 맞게 구현한 서브 클래스가 한다.
		
		//1. 팩토리 인터페이스를 자신에게 맞게 구현한 서브 클래스 생성
		//2. 팩토리 클래스에게 제품 클래스를 생성하도록 지시 
		//3. 제품 클래스는 공통 인터페이스를 구현하여 어떤 클래스가 생성되는지 몰라도 사용 가능
		//4. 구현된 팩토리의 orderPizza를 호출하게 되면 팩토리 내의 자신에게 맞게 구현한 createPizza 메소드가 작동하고
		//각각의 피자를 생성 
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		//제품 클래스는 모두 똑같은 인터페이스를 구현해야 한다
		//그래야 그 제품을 사용할 클래스에서 (PizzaStore) 구상 클래스가 아닌 인터페이스의 레퍼런스로 객체를 참조할 수 있다.
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("에단이 주문한" + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("조엘이 주문한" + pizza.getName() + "\n");
	}
}
