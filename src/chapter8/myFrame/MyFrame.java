package chapter8.myFrame;

import java.awt.Graphics;

import javax.swing.JFrame;

//update()메소드가 들어있는 JFrame을 확장 
//update()메소드는 화면 갱신 알고리즘을 제어한다
//paint()후크 메소드를 오버라이드 하면 그 알고리즘에 끼어들 수 있다.
public class MyFrame extends JFrame{
	
	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "내가 최고!!";
		graphics.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Head First Design Patterns");
	}
}
