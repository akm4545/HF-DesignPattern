package chapter7.homeTheater;

public class HomeTheaterFacade {
	//구성부분 
	//서브 시스템의 모든 구성 요소가 인스턴스 변수 형태로 저장
	Amplifier amp;
	Tuner tuner;
	StreamingPlayer player;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	//퍼사드의 생성자에는 서브 시스템 구성 요소의 레퍼런스가 전달 -> 저장
	public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer player, Projector projector, Screen screen, TheaterLights lights, PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.player = player;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		System.out.println("영화 볼 준비 중");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setStreamingPlayer(player);
		amp.setVolume(5);
		player.on();
		player.play(movie);
	}
	
	public void endMovie() {
		System.out.println("홈시어터를 끄는 중");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		player.stop();
		player.off();
	}
}
