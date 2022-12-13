package chapter11.dating;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//타인이 person 클래스에서 호출 할 수 있는 핸들러
public class NonOwnerInvocationHandler implements InvocationHandler{
	Person person;
	
	public NonOwnerInvocationHandler(Person person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			//getter 호출 가능
			if(method.getName().startsWith("get")) {
				return method.invoke(person, args);
			//괴짜점수 부여 가능
			}else if(method.getName().equals("setGeekRating")) {
				return method.invoke(person, args);
			//이외의 정보 셋팅은 막음
			}else if(method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
		}catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
