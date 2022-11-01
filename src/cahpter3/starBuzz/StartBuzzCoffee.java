package cahpter3.starBuzz;

import cahpter3.starBuzz.Beverage.Beverage;
import cahpter3.starBuzz.Beverage.DarkRoast;
import cahpter3.starBuzz.Beverage.Espresso;
import cahpter3.starBuzz.Beverage.HouseBlend;
import cahpter3.starBuzz.condiment.Mocha;
import cahpter3.starBuzz.condiment.Soy;
import cahpter3.starBuzz.condiment.Whip;

public class StartBuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
