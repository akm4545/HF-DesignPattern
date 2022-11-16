package chapter9.menu;

//반복을 캡슐화 하기 위한 인터페이스
public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
