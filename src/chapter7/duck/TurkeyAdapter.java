package chapter7.duck;

public class TurkeyAdapter implements Duck{
	//어뎁터에서 끼워넣을 인터페이스
	Turkey turkey;
	
	//해당 인터페이스를 받아 저장
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	//duck 인터페이스에 있던 quack을 turkey 인터페이스의 gobble을 실행하도록 
	//오버라이드
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0; i<5; i++) {
			turkey.fly();
		}
	}
	
}
