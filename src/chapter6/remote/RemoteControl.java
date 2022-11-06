package chapter6.remote;

public class RemoteControl {
	//커맨드를 저장하는 배열
	Command[] onCommands;
	Command[] offCommands;
	
	//생성자 
	//커맨드 배열을 초기화 시킨다.
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		
		//초기에는 배열에 아무것도 들어있지 않기 때문에 아무것도 안하는
		//커맨드로 초기화 시킨다
		for(int i=0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	//원하는 커맨드 배열의 인덱스에 저장
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	//버튼을 누르면 커맨드의 execute를 실행
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	//버튼을 누르면 커맨드의 execute를 실행
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------ 리모컨 ------\n");
		
		for(int i=0; i<onCommands.length; i++) {
			stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName() + "\n");
		}
		
		return stringBuffer.toString();
	}
}
