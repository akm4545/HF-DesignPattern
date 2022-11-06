package chapter6.remote;

//일종의 널 객체
//널 객체는 딱히 리턴할 객체도 없고 클라이언트가 null을 처리하지 않게 하고 싶을 때 활용하면 좋다.
//여러 디자인 패턴에서 유용하게 쓰이며 일종의 디자인 패턴으로 분류하기도 한다.
public class NoCommand implements Command{
	@Override
	public void execute() {}

	@Override
	public void undo() {}	
}
