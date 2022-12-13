package chapter11.album;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

//진짜 imageComponent가 필요한 상황 전까지 대체할 프록시 객체
public class ImageProxy implements Icon{
	volatile ImageIcon imageIcon;
	final URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageProxy(URL url) {
		imageURL = url;
	}
	
	public int getIconWidth() {
		if(imageIcon != null) {
			return imageIcon.getIconWidth();
		}else {
			return 800;
		}
	}
	
	@Override
	public int getIconHeight() {
		if(imageIcon != null) {
			return imageIcon.getIconHeight();
		}
		return 600;
	}
	
	synchronized void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
	
	//이미지가 불러오기 전에는 대기 메세지를 출력한다.
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		if(imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		}else {
			g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요.", x + 300, y + 190);
			
			if(!retrieving) {
				retrieving = true;
				
				retrievalThread = new Thread(new Runnable() {		
					@Override
					public void run() {
						try {
							setImageIcon(new ImageIcon(imageURL, "Album Cover"));
							c.repaint();
						}catch (Exception e) {
							e.printStackTrace();
						}
						
					}
				});
				
				//이미지를 다 가져와야 imageIcon 객체에 셋팅됨
				retrievalThread.start();
			}
		}
	}
}
