package chapter3.customInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) throws IOException{
		int c;
		
		try {
			//테코레이터 패턴을 사용하여 read의 기능 확장을 함
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			
			//한글자씩 읽으면서 출력
			while((c = in.read()) >= 0) {
				System.out.println((char)c);
			}
			
			in.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
