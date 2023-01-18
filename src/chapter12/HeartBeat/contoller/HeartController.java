package chapter12.HeartBeat.contoller;

import chapter12.DJ.controller.ControllerInterface;
import chapter12.DJ.view.DJView;
import chapter12.HeartBeat.model.HeartAdapter;
import chapter12.HeartBeat.model.HeartModelInterface;

public class HeartController implements ControllerInterface{
	HeartModelInterface model;
	DJView view;
	
	//하트모델을 받아 뷰에 어뎁터를 적용한 하트모델을 적용
	public HeartController(HeartModelInterface model) {
		this.model = model;
		
		//어뎁터를 적용한 하트모델이 getBPM을 호출하면 하트모델의 getRate를 실행하도록 함
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
