package chapter4.pizzaMaker;

import chapter4.pizzaMaker.ingredient.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
//	public PepperoniPizza() {
//		name = "Pepperoni Pizza";
//		dough = "Crust";
//		sauce = "Marinara sauce";
//		
//		toppings.add("Sliced Pepperoni");
//		toppings.add("Sliced Onion");
//		toppings.add("Grated parmesan cheese");
//	}
	
	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("준비 중: " + name);
		
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
