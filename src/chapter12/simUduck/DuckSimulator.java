package chapter12.simUduck;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
	
	void simulate() {
//		Quackable mallardDuck = new MallardDuck();
//		Quackable redheadDuck = new RedheadDuck();
//		Quackable duckCall = new DuckCall();
//		Quackable rubberDuck = new RubberDuck();
		
		//데코레이터로 감싸서 우는 횟수를 센다
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\n오리 시뮬레이션 게임 (+데코레이터)");
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		
		//우는 횟수가 static으로 선언되어 있으므로 값을 공유함
		System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + " 번");
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
