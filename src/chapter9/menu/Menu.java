package chapter9.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//디너 메뉴와 팬케이크 메뉴를 통일하기 위한 인터페이스
//추가로 구상 반복자 클래스를 만들어서 리턴할 책임을 지움
//public interface Menu {
//	public Iterator<MenuItem> createIterator();
//}

public class Menu extends MenuComponent{
	//MenuComponent형을 저장 할 수 있음 - 자식 노드
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	//MenuItem이나 다른 Menu를 추가하는 코드
	public void add(MenuComponent menuComponent) {
		menuComponent.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		menuComponent.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void print() {
		System.out.println("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("----------------------");
		
		//자기 자신이 가지고 있는 노드들의 print 호출
		for(MenuComponent menuComponent : menuComponents) {
			menuComponent.print();
		}
	}
}
