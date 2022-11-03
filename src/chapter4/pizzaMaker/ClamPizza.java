package chapter4.pizzaMaker;

import chapter4.pizzaMaker.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
//	public ClamPizza() {
//		name = "Clam Pizza";
//		dough = "Thin crust";
//		sauce = "White garlic sauce";
//		
//		toppings.add("Clams");
//		toppings.add("Grated parmesan cheese");
//	}
	
	PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("준비 중: " + name);
		
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClams();
	}
}
