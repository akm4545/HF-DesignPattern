package cahpter3.starBuzz.condiment;

import cahpter3.starBuzz.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage{
	Beverage beverage;
	public abstract String getDescription();
}
