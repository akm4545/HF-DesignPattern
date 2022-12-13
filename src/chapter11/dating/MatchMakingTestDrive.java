package chapter11.dating;

import java.lang.reflect.Proxy;
import java.util.HashMap;

//보호 프록시(Protection Proxy)
//접근 권한을 바탕으로 객체로의 접근을 제어하는 프록시
//이 외에도 
//방화벽 프록시(Firewall Proxy)[일련의 네트워크 자원으로의 접근을 제어, 주제를 나쁜 클라이언트로부터 보호]
//스마트 레퍼런스 프록시(Smart Reference Proxy)[주제가 참조될 때마다 추가 행동을 제공]
//캐싱 프록시(Caching Proxy)[비용이 많이 드는 작업의 결과를 임시로 저장한다. 여러 클라이언트에서 결과를 공유하게 해 줌으로써 계산 시간과 네트워크 지연을 줄여 주는 효과도 있다.]
//동기화 프록시(Synchronication Proxy)[여러 스레드에서 주제에 접근할 때 안전하게 작업을 처리할 수 있게 해 준다.]
//복잡도 숨김 프록시(Complexity Hiding Proxy)[복잡한 클래스의 집합으로의 접근을 제어하고, 그 복잡도를 숨겨 준다. 퍼사드 프록시(Facade Proxy)라고 부르기도 한다.
//이 프록시와 퍼사드 패턴의 차이점은 프록시는 접근을 제어하지만 퍼사드 패턴은 대체 인터페이스만 제공한다.]
//지연 복사 프록시(Copy-On_Write Proxy)[클라이언트에서 필요로 할 때까지 객체가 복사되는 것을 지연시킴으로써 객체의 복사를 제어한다. 변현된 가상 프록시다.]
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