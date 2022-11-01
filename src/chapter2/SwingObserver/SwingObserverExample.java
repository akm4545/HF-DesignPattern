package chapter2.SwingObserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		
		JButton button = new JButton("할까 말까?");
		
		//observer들을 등록 클릭시 상태가 변경되며 observer의 actionPerformed를 실행
//		button.addActionListener(new AngelListener());
//		button.addActionListener(new DevilListener());
		
		//람다 표현식으로 구현
		//함수 객체에 버튼이 클릭되었다는 연락이 가고 함수 객체로 구현된 메소드가 실행
		button.addActionListener(event -> 
			System.out.println("하지 마! 아마 후회할 걸"));
		button.addActionListener(event -> 
			System.out.println("그냥 저질러 버려!"));
	}
	
//	class AngelListener implements ActionListener {
//
//		//subject의 상태가 변경되면 호출될 observer의 메소드
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("하지 마! 아마 후회할 걸");
//		}
//	}
	
//	class DevilListener implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("그냥 저질러 버려!");
//		}
//	}
}
