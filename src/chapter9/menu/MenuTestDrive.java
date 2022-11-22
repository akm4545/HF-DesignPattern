package chapter9.menu;

//반복자 패턴(Iterator Pattern)
//컬렉션의 구현 방법을 노출하지 않으면서 집합체 내의 모든
//항목에 접근하는 방법을 제공
public class MenuTestDrive {
	public static void main(String args[]) {
		//메뉴들을 생성하고
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		//종업원에게 넘긴 뒤
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
		
		//출력
		waitress.printMenu();
	}
}
