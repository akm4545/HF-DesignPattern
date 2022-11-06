package chapter4.pizzaMaker;

import java.util.ArrayList;
import java.util.List;

import chapter4.pizzaMaker.ingredient.Cheese;
import chapter4.pizzaMaker.ingredient.Clams;
import chapter4.pizzaMaker.ingredient.Dough;
import chapter4.pizzaMaker.ingredient.Pepperoni;
import chapter4.pizzaMaker.ingredient.Sauce;
import chapter4.pizzaMaker.ingredient.Veggies;

public abstract class Pizza {
	public String name;
//	public String dough;
//	public String sauce;
//	public List<String> toppings = new ArrayList<String>();
	
	//피자 지점마다 사용하는 원재료들이 달라 팩토리에서 받아서 저장
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//추상 메소드로 만듦 이 부분에서 피자를 만드는데 필요한 재료들을 가져옴
	abstract void prepare();
	
//	public void prepare() {
//		System.out.println("준비 중 : " + name);
//		System.out.println("도우를 돌리는 중...");
//		System.out.println("소스를 뿌리는 중...");
//		System.out.println("토핑을 올리는 중: ");
//		
//		for(String topping : toppings) {
//			System.out.println(" " + topping);
//		}
//	}
	
	public void bake() {
		System.out.println("175도에서 25분 간 굽기");
	}
	
	public void cut() {
		System.out.println("피자를 사선으로 자르기");
	}
	
	public void box() {
		System.out.println("상자에 피자 담기");
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		
		display.append("----" + name + "----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		
		return display.toString();
	}
}
