package chapter6.remote;

//커맨드 패턴(Command Pattern)
//요청 내역을 객체로 캡슐화해서 객체를 서로 다른 요청 내역에 따라 매개변수화할 수 있다.
//요청을 큐에 저장하거나 로그로 기록하거나 작업 취소 기능을 사용할 수 있다.
public class RemoteControlTest {
	public static void main(String[] args) {
		//커맨드 패턴에서 클라이언트에 해당하는 부분
		
		//remote변수가 인보커 역할을 한다.
		//필요한 작업을 요청할 때 사용할 커맨드 객체를 인자로 전달받는다.
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		//요청을 받아서 처리할 리시버 객체를 생성
		//Light light = new Light();
		//GarageDoor garageDoor = new GarageDoor();
		
		//커맨드 객체를 생성 -> 이때 리시버를 전달
		//LightOnCommand lightOn = new LightOnCommand(light);
		//GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		//커맨드 객체를 인보커에게 전달
		//remote.setCommand(lightOn);
		
		//버튼 누름
		remote.buttonWasPressed();
		//remote.setCommand(garageOpen);
		remote.buttonWasPressed();
		
		//1. 요청을 처리할 리시버 객체를 생성한다.
		//2. 커맨드 객체를 생성한다 -> 커맨드 객체는 같은 인터페이스를 구현해야 한다
		//3. 커맨드 객체는 리시버 객체를 저장하고 있고 커맨드 객체의 인터페이스에서 정의한 execute 메소드를 실행하면 리시버 객체가 요청을 처리한다
		//4. 인보커에게 커맨드 객체를 전달한다
		//5. 인보커의 특정 메소드가 호출되면 커맨드 객체의 execute를 실행한다
	}
}
