package chapter9.menu;

import java.util.Iterator;
import java.util.List;

//반복을 캡슐화 하였기 때문에 배열이나 List의 반환 타입을 신경 쓸 필요 없음
public class Waitress {
//	PancakeHouseMenu pancakeHouseMenu;
//	DinerMenu dinerMenu;
	
	//종업원 클래스와 구상 클래스 사이의 의존성을 줄이기 위해 인터페이스에 맞춤
//	Menu pancakeHouseMenu;
//	Menu dinerMenu;
//	Menu cafeMenu;
	
	//메뉴를 List에 담아 처리함으로서 새로 생기는 메뉴가 생겨도 수정하지 않아도 됨
//	List<Menu> menus;
	
	MenuComponent allMenus;
	
//	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
//		this.pancakeHouseMenu = pancakeHouseMenu;
//		this.dinerMenu = dinerMenu;
//		this.cafeMenu = cafeMenu;
//	}
	
//	public Waitress(List<Menu> menus) {
//		this.menus = menus;
//	}
	
	public Waitress(MenuComponent allMenu) {
		this.allMenus = allMenu;
	}
	
//	public void printMenu() {
//		java.util.Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//		java.util.Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//		java.util.Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
//		
//		System.out.println("메뉴\n----\n아침 메뉴");
//		printMenu(pancakeIterator);
//		System.out.println("\n점심 메뉴");
//		printMenu(dinerIterator);
//		System.out.println("\n저녁 메뉴");
//		printMenu(cafeIterator);
//	}
	
	//List의 Iterator를 가져와 반복으로 처리
//	public void printMenu() {
//		Iterator<Menu> menuIterator = menus.iterator();
//		
//		while(menuIterator.hasNext()) {
//			Menu menu = menuIterator.next();
//			printMenu(menu.createIterator());
//		}
//	}
	
	//각각 알맞게 구현한 Iterator를 받아와 작업
//	private void printMenu(java.util.Iterator<MenuItem> iterator) {
//		while(iterator.hasNext()) {
//			MenuItem menuItem = iterator.next();
//			
//			System.out.println(menuItem.getName() + ", ");
//			System.out.println(menuItem.getPrice() + " -- ");
//			System.out.println(menuItem.getDescription());
//		}
//	}
	
	public void printMenu() {
		allMenus.print();
	}
}
