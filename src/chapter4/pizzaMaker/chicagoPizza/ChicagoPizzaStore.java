package chapter4.pizzaMaker.chicagoPizza;

import chapter4.pizzaMaker.Pizza;
import chapter4.pizzaMaker.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore{
	@Override
	public Pizza createPizza(String item) {
		if(item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}else if(item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		}else if(item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		}else if(item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		}else {
			return null;
		}
	}
}
