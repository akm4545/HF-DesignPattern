package chapter11.album;

import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
			menuItem.addActionListener(event -> {
				imageComponent.setIcon(new ImageProxy(getAlbumUrl(event.getActionCommand())));
				frame.repaint();
			});
		}
		
		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
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
