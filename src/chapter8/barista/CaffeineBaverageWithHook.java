package chapter8.barista;

public abstract class CaffeineBaverageWithHook {
	
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		
	}
	
	void pourInCup() {
		
	}
	
	boolean customerWantsCondiments() {
		return true;
	}
}
