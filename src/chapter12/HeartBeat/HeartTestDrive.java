package chapter12.HeartBeat;

import chapter12.DJ.controller.ControllerInterface;
import chapter12.HeartBeat.contoller.HeartController;
import chapter12.HeartBeat.model.HeartModel;

public class HeartTestDrive {
	public static void main(String[] args) {
		HeartModel heartModel = new HeartModel();
		ControllerInterface model = new HeartController(heartModel);
	}
}
