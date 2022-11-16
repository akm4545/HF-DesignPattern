package chapter9.menu;

public class MenuTestDrive {
	public static void main(String args[]) {
		//메뉴들을 생성하고
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		//종업원에게 넘긴 뒤
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		
		//출력
		waitress.printMenu();
	}
}
