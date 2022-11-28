package chapter9.menu;

//컴포지트 패턴(Composite Pattern)
//객체를 트리구조로 구성해서 부분-전체 계층구조를 구현
//컴포지트 패턴을 사용하면 클라이언트에서 개별 객체와 복합 객체를 똑같은 방법으로 다룰 수 있다.

//노드 = 전체, 리프 = 부분이 모두 적용해야 하는 추상 클래스
public abstract class MenuComponent {

	//이 메소드들 중 어떤 메소드는 노드에서만 쓰이고 어떤 메소드는 리프에서만 쓰임
	//모두 예외를 던짐으로 자기에 맞는 메소드만 오버라이드 해서 사용하면 됨
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	public void print() {
		throw new UnsupportedOperationException();
	}
}
