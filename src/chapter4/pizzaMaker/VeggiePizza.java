package chapter4.pizzaMaker;

import chapter4.pizzaMaker.ingredient.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
//	public VeggiePizza() {
//		name = "Veggie Pizza";
//		dough = "Crust";
//		sauce = "Marinara sauce";
//		
//		toppings.add("Shredded mozzarella");
//		toppings.add("Grated parmesan");
//		toppings.add("Diced onion");
//		toppings.add("Sliced mushrooms");
//		toppings.add("Sliced red pepper");
//		toppings.add("Sliced black olives");
//	}
	
	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("준비 중: " + name);
		
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}
}
