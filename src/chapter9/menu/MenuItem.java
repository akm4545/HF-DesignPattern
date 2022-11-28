package chapter9.menu;

//리프에 해당하는 클래스 
//MenuComponent 확장
public class MenuItem extends MenuComponent{
	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	//메뉴 컴포넌트의 print를 오버라이드
	public void print() {
		System.out.println(" " + getName());
		
		if(isVegetarian()) {
			System.out.println("(v)");
		}
		
		System.out.println(", " + getPrice());
		System.out.println("      -- " + getDescription());
	}
}
