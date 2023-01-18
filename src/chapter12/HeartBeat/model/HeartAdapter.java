package chapter12.HeartBeat.model;

import chapter12.DJ.model.BPMObserver;
import chapter12.DJ.model.BeatModelInterface;
import chapter12.DJ.model.BeatObserver;

//어텝터 패턴을 이용해서 heart모델을 BPM모델처럼 사용할 수 있도록 변경
public class HeartAdapter implements BeatModelInterface{
	HeartModelInterface heart;
	
	public HeartAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}
	
	public void initialize() {}
	
	public void on() {}
	
	public void off() {}
	
	public int getBPM() {
		return heart.getHeartRate();
	}
	
	public void setBPM(int bpm) {}
	
	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}
	
	public void removeObserver(BeatObserver o) {
		heart.removeObserver(o);
	}
	
	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}
	
	public void removeObserver(BPMObserver o) {
		heart.removeObserver(o);
	}
}
