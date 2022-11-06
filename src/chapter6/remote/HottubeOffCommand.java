package chapter6.remote;

public class HottubeOffCommand implements Command{
	Hottub hottub;
	
	public HottubeOffCommand(Hottub hottube) {
		this.hottub = hottube;
	}
	
	@Override
	public void execute() {
		hottub.on();
	}

	@Override
	public void undo() {
		hottub.off();
	}
}
