package chapter6.remote;

//커맨드 개체를 사용할 리모컨 클래스
public class SimpleRemoteControl {
	//커맨드를 저장할 슬롯
	Command slot;
	
	public SimpleRemoteControl() {
		
	}
	
	//제어할 명령을 설정하는 메소드 
	//제어할 명령을 바꿀 수 있다
	public void setCommand(Command command) {
		slot = command;
	}
	
	//버튼을 누르면 호출되는 메소드 
	//커맨드 객체의 execute를 실행한다
	public void buttonWasPressed() {
		slot.execute();
	}
}
