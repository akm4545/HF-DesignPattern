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
		
		System.out.println("\n오리 시뮬레이션 게임 (+옵저버)");
		
		//옵저버를 구현한 학자 클래스
		Quackologist quackologist = new Quackologist();
		
		//오리 무리들을 옵저버에 등록
		flockOfDucks.registerObserver(quackologist);
		
		//무리들이 차례대로 울음
		//옵저버에 알림
		simulate(flockOfDucks);
		
		//우는 횟수가 static으로 선언되어 있으므로 값을 공유함
		System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + " 번");
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
