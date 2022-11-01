package cahpter3.starBuzz.condiment;

import cahpter3.starBuzz.Beverage.Beverage;

public class Whip extends CondimentDecorator{
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑";
	}

	@Override
	public double cost() {
		return beverage.cost() + .40;
	}

}
