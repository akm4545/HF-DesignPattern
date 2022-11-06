package chapter4.pizzaMaker;

import chapter4.pizzaMaker.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
	//기존에는 피자마다 레시피가 변하면 직접 수정해줘야 했음
	//또한 지점마다 같은종류의 피자이지만 다른 재료를 사용한다면 지점마다 지점의 피자 클래스를 만들어줘야 했음
//	public CheesePizza() {
//		name = "Cheese Pizza";
//		dough = "Regular Crust";
//		sauce = "Marinara Pizza Sauce";
//		
//		toppings.add("Fresh Mozzarella");
//		toppings.add("Parmesan");
//	}
	
	PizzaIngredientFactory ingredientFactory;
	
	//생성하면서 전달받은 팩토리를 저장
	//어떤 재료가 전달되는지 전혀 신경쓰지 않고 만드는 법만 알고있음
	//피자 클래스와 지역별 재료를 분리
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	//재료 준비
	void prepare() {
		System.out.println("준비 중: " + name);
		
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}