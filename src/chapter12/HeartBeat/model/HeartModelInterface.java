package chapter12.HeartBeat.model;

import chapter12.DJ.model.BPMObserver;
import chapter12.DJ.model.BeatObserver;

public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}
