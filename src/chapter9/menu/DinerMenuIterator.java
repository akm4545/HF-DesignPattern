package chapter9.menu;

//반복을 캡슐화하기 위한 인터페이스를 구현하여 제공
//자바에서 제공하는 Iterator를 구현해서 사용
public class DinerMenuIterator implements java.util.Iterator<MenuItem>{
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		
		return menuItem;
	}
	
	public void remove() {
		throw new UnsupportedOperationException("메뉴 항목은 지우면 안됩니다.");
	}
}
