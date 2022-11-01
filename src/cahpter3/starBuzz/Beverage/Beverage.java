package cahpter3.starBuzz.Beverage;

//음료 추상 클래스
public abstract class Beverage {
	String description = "제목 없음";
	
	public String getDescription() {
		return description;
	}
	
	//서브 클래스에서 구현
	public abstract double cost();
}
