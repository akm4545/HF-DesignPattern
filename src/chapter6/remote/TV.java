package chapter6.remote;

public class TV {
	String location = "";
	
	public TV(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println("TV is on");
	}
	
	public void off() {
		System.out.println("TV is off");
	}
}
