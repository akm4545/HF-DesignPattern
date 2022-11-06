package chapter3.starBuzz.condiment;

import chapter3.starBuzz.Beverage.Beverage;

//첨가물 추상 클래스 음료 클래스를 감싸야 하므로 Beverage를 확장한다
public abstract class CondimentDecorator extends Beverage{
	//어떤 음료도 감쌀 수 있도록 음료들이 상속받은 Beverage를 정의 
	Beverage beverage;
	
	//모든 첨가물이 새로 구현하도록 해야해서 추상 메서드로 선언
	public abstract String getDescription();
}
