package chapter6.remote;

//작업 취소가 추가된 remote 클래스
public class RemoteControlWithUndo {
	Command[] onCommands;
	Command[] offCommands;
	
	//취소 작업을 기억할 command
	Command undoCommand;
	
	public RemoteControlWithUndo() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		
		for(int i=0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	//버튼을 누르는 액션을 취하면 해당 명령을 내렸던 command객체를 기억하고 있음
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	//마지막으로 버튼을 눌렀던 command 객체의 취소 명령을 실행
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}
