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
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
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
		
		for(MenuComponent menuComponent : menuComponents) {
			menuComponent.print();
		}
	}
}
