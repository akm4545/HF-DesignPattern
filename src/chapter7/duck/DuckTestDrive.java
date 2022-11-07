package chapter7.duck;

//어댑터 패턴(Adapter Pattern)
//특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환한다.
//인터페이스가 호환되지 않아 같이 쓸 수 없었던 클래스를 사용할 수 있게 도와준다.
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
