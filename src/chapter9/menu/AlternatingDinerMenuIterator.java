package chapter9.menu;

import java.util.Calendar;

public class AlternatingDinerMenuIterator {
	MenuItem[] items;
	int position;
	
	public AlternatingDinerMenuIterator(MenuItem[] items) {
		this.items = items;
		position = Calendar.DAY_OF_WEEK % 2;
	}
	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		}else{
			return true;
		}
	}
	
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 2;
		
		return menuItem;
	}
	
	public void remove() {
		new UnsupportedOperationException("remove()는 지원하지 않습니다.");
	}
}
