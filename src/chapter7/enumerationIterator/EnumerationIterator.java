package chapter7.enumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

//어댑터 구현 코드
public class EnumerationIterator implements Iterator<Object>{
	//Enumeration 클래스 저장
	Enumeration<?> enumeration;
	
	//생성하면서 갈아끼울 인터페이스 저장
	public EnumerationIterator(Enumeration<?> enumeration) {
		this.enumeration = enumeration;
	}

	//기존 Iterator 인터페이스의 메소드를 적절한 Enumeration로 구현 
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}
	
	//없는 메소드는 예외 발생
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
