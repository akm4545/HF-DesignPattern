package chapter11.dating;

import java.lang.reflect.Proxy;
import java.util.HashMap;

//보호 프록시(Protection Proxy)
//접근 권한을 바탕으로 객체로의 접근을 제어하는 프록시
public class MatchMakingTestDrive {
	HashMap<String, Person> datingDB = new HashMap<String, Person>();
	
	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}
	
	public MatchMakingTestDrive() {
		initializeDatabase();
	}
	
	public void drive() {
		//김자바의 정보를 가져온다
		Person joe = getPersonFromDatabase("김자바");
		//김자바의 정보를 프록시로 감싼다
		Person ownerProxy = getOwnerProxy(joe);
		
		//본인의 이름을 가져온다
		System.out.println("이름: " + ownerProxy.getName());
		
		//본인의 관심사를 등록한다
		ownerProxy.setInterests("볼링, 바둑");
		
		System.out.println("본인 프록시에 관심 사항을 등록합니다.");
		
		try {
			//본인의 괴짜점수는 매길 수 없으므로 예외가 발생한다
			ownerProxy.setGeekRating(10);
		}catch (Exception e) {
			System.out.println("본인 프록시에는 괴짜 지수를 매길 수 없습니다.");
		}
		
		System.out.println("괴짜 지수: " + ownerProxy.getGeekRating());
		
		//타인이 사용할 인물 프록시를 가져온다
		Person nonOwnerProxy = getNonOwnerProxy(joe);
		
		System.out.println("이름: " + nonOwnerProxy.getName());
		
		try {
			//타인의 프록시에 취미를 등록할 수 없다.
			nonOwnerProxy.setInterests("볼링, 바둑");
		}catch (Exception e) {
			System.out.println("타인 프록시에는 관심 사항을 등록할 수 없습니다.");
		}
		
		nonOwnerProxy.setGeekRating(3);
		
		System.out.println("타인 프록시에 괴짜 지수를 매깁니다.");
		System.out.println("괴짜 지수: " + nonOwnerProxy.getGeekRating());
	}
	
	Person getOwnerProxy(Person person) {
		return (Person) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}
	
	//프록시 생성 코드
	Person getNonOwnerProxy(Person person) {
		return (Person) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), //클래스 로더 
				person.getClass().getInterfaces(),  //구현해야 하는 인터페이스
				new NonOwnerInvocationHandler(person)); // 호출 핸들러
	}
	
	//DB에서 해당 인물의 정보를 가져온다
	Person getPersonFromDatabase(String name) {
		return (Person)datingDB.get(name);
	}
	
	//DB 초기화
	void initializeDatabase() {
		//인물을 생성하고 초기화 데이터를 넣는다
		Person joe = new PersonImpl();
		
		joe.setName("Joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setGeekRating(7);
		
		datingDB.put(joe.getName(), joe);
		
		Person kelly = new PersonImpl();
		
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setGeekRating(6);
		
		datingDB.put(kelly.getName(), kelly);
	}
}