package chapter3.starBuzz.Beverage;

//Beverage클래스를 확장
public class DarkRoast extends Beverage{
	
	//생성자에서 description을 설정
	public DarkRoast() {
		description = "다크 로스트";
	}

	//자기 자신의 값만 리턴함
	//사이즈 별 값 return
	@Override
	public double cost() {
		if(getSize().equals(Size.GRANDE)) {
			return 2.10;
		}else if(getSize().equals(Size.VENTI)) {
			return 2.20;
		}
		
		return 2.00;
	}
}
