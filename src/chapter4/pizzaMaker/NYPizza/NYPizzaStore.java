package chapter4.pizzaMaker.NYPizza;

import chapter4.pizzaMaker.CheesePizza;
import chapter4.pizzaMaker.ClamPizza;
import chapter4.pizzaMaker.PepperoniPizza;
import chapter4.pizzaMaker.Pizza;
import chapter4.pizzaMaker.PizzaStore;
import chapter4.pizzaMaker.ingredient.NYPizzaIngredientFactory;
import chapter4.pizzaMaker.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore{
//	@Override
//	public Pizza createPizza(String item) {
//		if(item.equals("cheese")) {
//			return new NYStyleCheesePizza();
//		}else if(item.equals("pepperoni")) {
//			return new NYStylePepperoniPizza();
//		}else if(item.equals("clam")) {
//			return new NYStyleClamPizza();
//		}else if(item.equals("veggie")) {
//			return new NYStyleVeggiePizza();
//		}else {
//			return null;
//		}
//	}
	
	//각 지점별로 재료가 달라 피자 클래스를 따로 만들어 줘야 했다면
	//재료도 팩토리 패턴으로 생성하므로 지점만큼 피자의 클래스가 필요하지 않음
	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("뉴옥 스타일 치즈 피자");
		}else if(item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("뉴욕 스타일 페퍼로니 피자");
		}else if(item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("뉴욕 스타일 조개 피자");
		}else if(item.equals("veggie")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("뉴욕 스타일 야채 피자");
		}
		
		return pizza;
	}
}