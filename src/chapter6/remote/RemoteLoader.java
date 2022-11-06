package chapter6.remote;

public class RemoteLoader {
	public static void main(String[] args) {
		//RemoteControl remoteControl = new RemoteControl();
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		//각각의 기능을 구현한 객체를 생성
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Garage");
		Stereo stereo = new Stereo("Living Room");
		
		//커맨드를 생성하면서 execute메소드에 어떤 일을 할지 저장함
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		//리모컨에 커맨드를 저장
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		//람다식으로 표현 가능
		//커맨드 객체가 하나의 메소드만 있을 시 사용 가능
		//remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
		
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
		
		System.out.println(remoteControl);
		
		//차례로 슬롯을 누름
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		
		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
		
		TV tv = new TV("Living Room");
		Hottub hottub = new Hottub();
		
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubeOnCommand hottubOn = new HottubeOnCommand(hottub);
		
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubeOffCommand hottubOff = new HottubeOffCommand(hottub);
		
		Command[] partyOn = {livingRoomLightOn, stereoOnWithCD, tvOn, hottubOn};
		Command[] partyOff = {livingRoomLightOff, stereoOff, tvOff, hottubOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
	}
}
