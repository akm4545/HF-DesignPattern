package chapter4.pizzaMaker;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	public String name;
	public String dough;
	public String sauce;
	public List<String> toppings = new ArrayList<String>();
	
	public String getName() {
		return name;
	}
	
	public void prepare() {
		System.out.println("준비");
	}
	
	public void bake() {
		System.out.println("굽기");
	}
	
	public void cut() {
		System.out.println("자르기");
	}
	
	public void box() {
		System.out.println("포장");
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		
		display.append("----" + name + "----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		
		for(String topping : toppings) {
			display.append(topping + "\n");
		}
		
		return display.toString();
	}
}
