package chapter4.pizzaMaker.chicagoPizza;

import chapter4.pizzaMaker.CheesePizza;
import chapter4.pizzaMaker.ClamPizza;
import chapter4.pizzaMaker.PepperoniPizza;
import chapter4.pizzaMaker.Pizza;
import chapter4.pizzaMaker.PizzaStore;
import chapter4.pizzaMaker.VeggiePizza;
import chapter4.pizzaMaker.ingredient.ChicagoPizzaIngredientFactory;
import chapter4.pizzaMaker.ingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore{
//	@Override
//	public Pizza createPizza(String item) {
//		if(item.equals("cheese")) {
//			return new ChicagoStyleCheesePizza();
//		}else if(item.equals("pepperoni")) {
//			return new ChicagoStylePepperoniPizza();
//		}else if(item.equals("clam")) {
//			return new ChicagoStyleClamPizza();
//		}else if(item.equals("veggie")) {
//			return new ChicagoStyleVeggiePizza();
//		}else {
//			return null;
//		}
//	}
	
	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		if(item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("시카고 스타일 치즈 피자");
		}else if(item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("시카고 스타일 페퍼로니 피자");
		}else if(item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("시카고 스타일 조개 피자");
		}else if(item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("시카고 스타일 야패 피자");
		}
		
		return pizza;
	}
}
