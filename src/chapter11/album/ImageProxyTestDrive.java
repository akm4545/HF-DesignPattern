package chapter11.album;

import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//가상 프록시
//생성하는데 많은 비용이 드는 객체를 대신한다.
//진짜 객체가 필요한 상황이 오기 전까지 객체의 생성을 미루는 기능을 제공한다.
//객체 생성 전이나 객체 생성 도중에 객체를 대신하기도 한다.
//객체 생성이 끝나면 RealSubject에 직접 요청을 전달한다.
public class ImageProxyTestDrive {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("Album Cover Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> albums = new Hashtable<String, String>();
	
	public static void main(String[] args) throws Exception {
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}
	
	public ImageProxyTestDrive() throws Exception{
		albums.put("Buddha Bar", "https://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
		albums.put("Ima", "https://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
		albums.put("Karma", "https://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.jpg");
		albums.put("MCMXC a.D.", "https://images.amazon.com/images/P/B0000002URV.01.LZZZZZZZ.jpg");
		albums.put("Northern Exposure", "https://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
		albums.put("Selected Ambient Works, Vol. 2", "https://images.amazon.com/images/P/B000002MNZ.01LZZZZZZZ.jpg");
		
		URL initialURL = new URL((String)albums.get("Selected Ambient Works, Vol. 2")); 
		menuBar = new JMenuBar();
		menu = new JMenu("Favorite Albums");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		
		for(Enumeration<String> e = albums.keys(); e.hasMoreElements();) {
			String name = (String)e.nextElement();
			JMenuItem menuItem = new JMenuItem();
			menu.add(menuItem);
			
			//이미지 프록시가
			menuItem.addActionListener(event -> {
				imageComponent.setIcon(new ImageProxy(getAlbumUrl(event.getActionCommand())));
				frame.repaint();
			});
		}
		
		//초기 URL 지정
		Icon icon = new ImageProxy(initialURL);
		//프록시를 감싸서 생성
		imageComponent = new ImageComponent(icon);
		//프록시가 화면에 표시되도록 함
		//이미지가 로딩되기 전에는 기본 메세지를 출력
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
	
	URL getAlbumUrl(String name) {
		try {
			return new URL((String)albums.get(name));
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
