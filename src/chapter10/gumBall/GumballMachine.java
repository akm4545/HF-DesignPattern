package chapter10.gumBall;

public class GumballMachine {
	//상태 코드
//	final static int SOLD_OUT = 0;
//	final static int NO_QUARTER = 1;
//	final static int HAS_QUARTER = 2;
//	final static int SOLD = 3;
	
	//초기 상태
//	int state = SOLD_OUT;
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	
	//생성자
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldOutState(this);
		
		this.count = numberGumballs;
		
		if(numberGumballs > 0) {
			state = noQuarterState;
		}else {
			state = soldOutState;
		}
	}
	
	//코인을 넣는 메서드
//	public void insertQuarter() {
//		if(state == HAS_QUARTER) {
//			System.out.println("동전은 한 개만 넣어 주세요.");
//		}else if(state == NO_QUARTER) {
//			state = HAS_QUARTER;
//			System.out.println("동전을 넣으셨습니다.");
//		}else if(state == SOLD_OUT) {
//			System.out.println("매진되었습니다. 다음 기회에 이용해 주세요.");
//		}else if(state == SOLD) {
//			System.out.println("알맹이를 내보내고 있습니다.");
//		}
//	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	//동전 반환 메서드
//	public void ejectQuarter() {
//		if(state == HAS_QUARTER) {
//			System.out.println("동전이 반환됩니다.");
//		}else if(state == NO_QUARTER) {
//			System.out.println("동전을 넣어 주세요.");
//		}else if(state == SOLD) {
//			System.out.println("이미 알맹이를 뽑으셨습니다.");
//		}else if(state == SOLD_OUT) {
//			System.out.println("동전을 넣지 않으셨습니다. 동전이 반환되지 않습니다.");
//		}
//	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	//손잡이 돌리는 메서드
//	public void turnCrank() {
//		if(state == SOLD) {
//			System.out.println("손잡이는 한 번만 돌려 주세요.");
//		}else if(state == NO_QUARTER) {
//			System.out.println("동전을 넣어 주세요.");
//		}else if(state == SOLD_OUT) {
//			System.out.println("매진되었습니다.");
//		}else if(state == HAS_QUARTER) {
//			System.out.println("손잡이를 돌리셨습니다.");
//			state = SOLD;
//			dispense();
//		}
//	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		
		if(count > 0) {
			count = count - 1;
		}
	}
	
	int getCount() {
		return count;
	}
	
	public State getState() {
		return state;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
	
	//뽑기 메서드
//	public void dispense(){
//		if(state == SOLD) {
//			System.out.println("알맹이를 내보내고 있습니다.");
//			count = count - 1;
//			
//			if(count == 0) {
//				System.out.println("더 이상 알맹이가 없습니다.");
//				state = SOLD_OUT;
//			}else {
//				state = NO_QUARTER;
//			}
//		}else if(state == NO_QUARTER) {
//			System.out.println("동전을 넣어 주세요.");
//		}else if(state == SOLD_OUT) {
//			System.out.println("매진입니다.");
//		}else if(state == HAS_QUARTER) {
//			System.out.println("알맹이를 내보낼 수 없습니다.");
//		}
//	}
//	
//	//알맹이 넣기
////	public void refill(int numGumBalls) {
////		this.count = numGumBalls;
////		state = NO_QUARTER;
////	}
//
//	void refill(int count) {
//		this.count += count;
//		System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
//		state.refill();
//	}
//	
//	public String toString() {
//		StringBuffer result = new StringBuffer();
//		
//		result.append("\nMighty Gumball, inc.");
//		result.append("\nJava-enabled Standing Gumball Model #2004\n");
//		result.append("Inventory: " + count + " gumball");
//		
//		if(count != 1) {
//			result.append("s");
//		}
//		
//		result.append("\nMachine is ");
//		
//		if(state == SOLD_OUT) {
//			result.append("sold out");
//		}else if(state == NO_QUARTER) {
//			result.append("waiting for quarter");
//		}else if(state == HAS_QUARTER) {
//			result.append("waiting for turn of crank");
//		}else if(state == SOLD) {
//			result.append("delivering a gumball");
//		}
//		
//		result.append("\n");
//		return result.toString();
//	}
}
