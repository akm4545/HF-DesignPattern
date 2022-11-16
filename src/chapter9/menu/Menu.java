package chapter9.menu;

import java.util.Iterator;

//디너 메뉴와 팬케이크 메뉴를 통일하기 위한 인터페이스
//추가로 구상 반복자 클래스를 만들어서 리턴할 책임을 지움
public interface Menu {
	public Iterator<MenuItem> createIterator();
}
