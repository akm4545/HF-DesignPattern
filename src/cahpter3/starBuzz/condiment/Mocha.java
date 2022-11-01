package cahpter3.starBuzz.condiment;

import cahpter3.starBuzz.Beverage.Beverage;

//데코레이터 클래스 CondimentDecorator를 확장하고 CondimentDecorator는 Beverage를 확장한다
public class Mocha extends CondimentDecorator{
	
	//감싸고자 하는 음료 객체가 확장한 beverage로 설정
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	//설명에 추가로 첨가물의 설명을 붙여줌 장식하고 있는 객체에 작업을 위임하고 그 결과값에 +
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	//가격에 추가로 첨가물의 가격을 붙여줌 장식하고 있는 객체에 작업을 위임하고 그 결과값에 +
	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

}
