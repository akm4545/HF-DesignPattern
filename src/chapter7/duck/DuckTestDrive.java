package chapter7.duck;

public class DuckTestDrive {
	public static void main(String[] args) {
		Duck  duck = new MallardDuck();
		
		Turkey turkey = new WildTurkey();
		Duck turkeyAdapDuck = new TurkeyAdapter(turkey);
		
		System.out.println("칠면조가 말하길");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\n오리가 말하길");
		testDuck(turkeyAdapDuck);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
