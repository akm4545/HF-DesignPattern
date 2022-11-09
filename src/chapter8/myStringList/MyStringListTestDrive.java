package chapter8.myStringList;

import java.util.List;

public class MyStringListTestDrive {
	public static void main(String[] args) {
		String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
		MyStringList duckList = new MyStringList(ducks); 
		List<String> ducksSubList = duckList.subList(2, 3); 
	}
}
