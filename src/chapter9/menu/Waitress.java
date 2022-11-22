package chapter9.menu;

//반복을 캡슐화 하였기 때문에 배열이나 List의 반환 타입을 신경 쓸 필요 없음
public class Waitress {
//	PancakeHouseMenu pancakeHouseMenu;
//	DinerMenu dinerMenu;
	
	//종업원 클래스와 구상 클래스 사이의 의존성을 줄이기 위해 인터페이스에 맞춤
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		java.util.Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		java.util.Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		java.util.Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
		
		System.out.println("메뉴\n----\n아침 메뉴");
		printMenu(pancakeIterator);
		System.out.println("\n점심 메뉴");
		printMenu(dinerIterator);
		System.out.println("\n저녁 메뉴");
		printMenu(cafeIterator);
	}
	
	private void printMenu(java.util.Iterator<MenuItem> iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
