package chapter4.pizzaMaker.ingredient;

//재료를 만드는 팩토리
//서브 클래스에서 구현
//추상 팩토리 패턴
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
