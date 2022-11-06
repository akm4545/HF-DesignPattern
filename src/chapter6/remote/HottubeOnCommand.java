package chapter6.remote;

public class HottubeOnCommand implements Command{
	Hottub hottub;
	
	public HottubeOnCommand(Hottub hottub) {
		this.hottub = hottub;
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
