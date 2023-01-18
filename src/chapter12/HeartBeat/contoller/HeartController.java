package chapter12.HeartBeat.contoller;

import chapter12.DJ.controller.ControllerInterface;
import chapter12.DJ.view.DJView;
import chapter12.HeartBeat.model.HeartAdapter;
import chapter12.HeartBeat.model.HeartModelInterface;

public class HeartController implements ControllerInterface{
	HeartModelInterface model;
	DJView view;
	
	public HeartController(HeartModelInterface model) {
		this.model = model;
		
		view = new DJView(this, new HeartAdapter(model));
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}
	
	public void start() {}
	
	public void stop() {}
	
	public void increaseBPM() {}
	
	public void decreaseBPM() {}
	
	public void setBPM(int bpm) {}
}
