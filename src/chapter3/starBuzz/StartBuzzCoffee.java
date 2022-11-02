package chapter3.starBuzz;

import chapter3.starBuzz.Beverage.Beverage;
import chapter3.starBuzz.Beverage.DarkRoast;
import chapter3.starBuzz.Beverage.Espresso;
import chapter3.starBuzz.Beverage.HouseBlend;
import chapter3.starBuzz.Beverage.Beverage.Size;
import chapter3.starBuzz.condiment.Mocha;
import chapter3.starBuzz.condiment.Soy;
import chapter3.starBuzz.condiment.Whip;

//데코레이터 패턴(Decorator Pattern) 
//객체에 추가 요소를 동적으로 더할 수 있다 
//데코레이터를 사용하면 서브클래스를 만들 때보다 훨씬 유연하게 기능을 확장할 수 있다
public class StartBuzzCoffee {
	public static void main(String[] args) {
		
		//Beverage를 확장한 음료 클래스를 생성
		Beverage beverage = new Espresso();
		
		//Beverage를 확장한 음료 클래스가 구현한 메서드를 호출
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		//Beverage를 확장한 음료 클래스를 생성
		Beverage beverage2 = new DarkRoast();
		
		//1.모카 객체를 생성한다.
		//2.생성하면서 먼저 만들었던 Beverage를 확장하며 만들었던 다크 로스트를 모카 객체에 저장한다.
		//3.생성된 다크 로스트를 감싸고 있는 모카 객체를 beverage2 변수에 덮어씌운다.
		//4.모두 같은 클래스를 확장했으므로 다형성으로 무리없이 감쌀 수 있다.
		beverage2.setSize(Size.GRANDE);
		beverage2 = new Mocha(beverage2);
		
		//이하 반복
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		//beverage2의 메소드를 실행하면 음료의 기능에서 확장시킨 CondimentDecorator
		//추상 클래스는 Beverage를 저장 할 수 있도록 만들어져 있다.
		//그를 확장시킨 첨가물 클래스들은 저장된 Beverage클래스를 확장한 클래스를 역순으로 타고 들어가면서 
		//리턴값을 받아 추가작업을 하며 리턴한다 -> 재귀와 비슷한 느낌
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
