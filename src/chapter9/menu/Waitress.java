package chapter9.menu;

//반복을 캡슐화 하였기 때문에 배열이나 List의 반환 타입을 신경 쓸 필요 없음
public class Waitress {
//	PancakeHouseMenu pancakeHouseMenu;
//	DinerMenu dinerMenu;
	
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		java.util.Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		java.util.Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		
		System.out.println("메뉴\n----\n아침 메뉴");
		printMenu(pancakeIterator);
		System.out.println("\n점심 메뉴");
		printMenu(dinerIterator);
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
