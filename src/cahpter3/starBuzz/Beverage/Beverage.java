package cahpter3.starBuzz.Beverage;

//음료 추상 클래스
public abstract class Beverage {
	
	//추가 요구사항 -> 음료의 사이즈 추가 -> 사이즈별 금액을 다르게 받아야함
	public enum Size {TALL, GRANDE, VENTI};
	Size size = Size.TALL;
	String description = "제목 없음";
	
	public String getDescription() {
		return description;
	}
	
	//서브 클래스에서 구현
	public abstract double cost();
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
}
