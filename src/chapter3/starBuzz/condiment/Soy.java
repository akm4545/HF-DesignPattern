package chapter3.starBuzz.condiment;

import chapter3.starBuzz.Beverage.Beverage;

public class Soy extends CondimentDecorator{
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}

	@Override
	public double cost() {
		return beverage.cost() + .30;
	}
}
