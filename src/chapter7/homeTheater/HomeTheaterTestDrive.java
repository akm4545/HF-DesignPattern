package chapter7.homeTheater;

//퍼사드 패턴(Facade Pattern)
//서브 시스템에 있는 일련의 인터페이스를 통합 인터페이스로 묶어준다
//또한 고수준 인퍼에티스도 정의하므로 서브 시스템을 더 편리하게 사용할 수 있다.
public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Amplifier");
		Tuner tuner = new Tuner("AM/FM Tuner", amp);
		StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
		CdPlayer cd = new CdPlayer("CD Player", amp);
		Projector projector = new Projector("Projector", player);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
		
		HomeTheaterFacade hoemTheater = new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);
		
		hoemTheater.watchMovie("Raiders of the Lost Ark");
		hoemTheater.endMovie();
	}
}
