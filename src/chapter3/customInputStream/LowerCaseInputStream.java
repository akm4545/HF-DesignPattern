package chapter3.customInputStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

//InputStream의 추상 데코레이터인 FilterInputStream을 확장
public class LowerCaseInputStream extends FilterInputStream{

	//생성하면서 InputStream을 확장한 데코레이터를 받아 저장
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	//byte를 읽고 난 뒤 소문자로 변환
	//읽을 문자가 없다면 -1을 리턴하고 있다면 소문자로 변환
	//filterInputStream을 장식하는 LowerCaseInputStream의 read를 실행하면
	//장식하는 inputStream의 read를 실행 후 추가로 소문자 변환 작업을 진행
	//데코레이터 패턴의 유연한 기능 확장
	public int read() throws IOException {
		int c = in.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	//byte배열을 읽고 난 뒤 소문자로 변환
	//읽을 문자가 없다면 -1을 리턴하고 있다면 소문자로 변환
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = in.read(b, offset, len);
		
		for (int i=offset; i<offset + result; i++) {
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		
		return result;
	}
}
