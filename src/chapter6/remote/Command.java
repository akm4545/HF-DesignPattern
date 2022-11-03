package chapter6.remote;

//커맨드 인터페이스 
//커맨드 객체는 모두 같은 인터페이스를 구현해야한다
//실행 명령을 내릴 execute 메소드 하나만 있으면 된다
public interface Command {
	public void execute();
}
