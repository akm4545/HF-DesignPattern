package chapter11.dating;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//본인용 호출 핸들러
//호출 핸들러는 InvocationHandler를 구현해야 한다
public class OwnerInvocationHandler implements InvocationHandler{
	Person person;
	
	public OwnerInvocationHandler(Person person) {
		this.person = person;
	}
	
	//프록시의 메소드가 호출될 때마다 호출되는 invoke 메소드
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			//getter 메소드는 실행 가능
			if(method.getName().startsWith("get")) {
				return method.invoke(person, args);
			//setGeekRating 자기 자신에 괴짜 점수는 줄 수 없으므로 해당 메서드를 호출하면 예외를 던짐
			}else if(method.getName().equals("setGeekRating")) {
				throw new IllegalAccessException();
			//이외의 setter는 호출 가능
			}else if(method.getName().startsWith("set")) {
				return method.invoke(person, args);
			}
		}catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		//다른 메서드가 호출되면 null을 리턴
		return null;
	}
}
