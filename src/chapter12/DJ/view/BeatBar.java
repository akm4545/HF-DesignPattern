package chapter12.DJ.view;

import javax.swing.JProgressBar;

public class BeatBar extends JProgressBar implements Runnable{
	private static final long serialVersionUID = 2L;
	Thread thread;
	
	public BeatBar() {
		thread = new Thread(this);
		setMaximum(100);
		thread.start();
	}
	
	public void run() {
		for(;;) {
			int value = getValue();
			value = (int)(value * .75);
			setValue(value);
			repaint();
			
			try {
				thread.sleep(50);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
