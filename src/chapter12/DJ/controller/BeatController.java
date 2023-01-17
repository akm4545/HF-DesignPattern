package chapter12.DJ.controller;

import chapter12.DJ.model.BeatModelInterface;
import chapter12.DJ.view.DJView;

//컨트롤러 
//뷰가 내린 명령을 전달
public class BeatController implements ControllerInterface{
	BeatModelInterface model;
	DJView view;
	
	public BeatController(BeatModelInterface model) {
		this.model = model;
		view = new DJView(this, model);
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		
		model.initialize();
	}
	
	public void start() {
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}
	
	public void stop() {
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}
	
	public void increaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm + 1);
	}
	
	public void decreaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm - 1);
	}
	
	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}
}
