package chapter12.simUduck;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate(duckFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
//		Quackable mallardDuck = new MallardDuck();
//		Quackable redheadDuck = new RedheadDuck();
//		Quackable duckCall = new DuckCall();
//		Quackable rubberDuck = new RubberDuck();
		
		//데코레이터로 감싸서 우는 횟수를 센다
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());
		
		System.out.println("\n오리 시뮬레이션 게임 (+데코레이터)");
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards = new Flock();
		
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\n오리 시뮬레이션 게임: 전체 무리");
		simulate(flockOfDucks);
		
		System.out.println("\n오리 시뮬레이션 게임: 물오리 무리");
		simulate(flockOfMallards);
		
		//우는 횟수가 static으로 선언되어 있으므로 값을 공유함
		System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + " 번");
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
