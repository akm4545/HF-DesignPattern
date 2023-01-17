package chapter12.DJ;

import chapter12.DJ.controller.BeatController;
import chapter12.DJ.controller.ControllerInterface;
import chapter12.DJ.model.BeatModel;
import chapter12.DJ.model.BeatModelInterface;

public class DJTestDrive {
	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model); 
	}
}
