package chapter6.remote;

//커맨드 클래스
public class LightOnCommand implements Command{
	//작업을 실행할 객체를 저장할 변수
	Light light;
	
	//생성자로 제어할 특정 조명을 변수에 저장함
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	//execute를 실행하면 Light의 on 메소드가 실행됨
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}	
}
