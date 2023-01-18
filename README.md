# HF-DesignPattern

전략 패턴(Strategy Pattern)
알고리즘군을 정의하고 캡슐화해서 각각의 알고리즘군을 수정해서 쓸 수 있게 해준다.
전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있다.
교환 가능한 행동을 캡슐화하고 위임으로 어떤 행동을 사용할지 결정.

옵저버 패턴 (Observer pattern)
한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고 
자동으로 내용이 갱신되는 방식으로 일대다(one-to-many)의존성을 가짐

데코레이터 패턴(Decorator Pattern) 
객체에 추가 요소를 동적으로 더할 수 있다 
데코레이터를 사용하면 서브클래스를 만들 때보다 훨씬 유연하게 기능을 확장할 수 있다

팩토리 메소드 패턴(Factory Method Pattern)
객체를 생성할 때 필요한 인터페이스를 만든다.
어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정한다.
팩토리 메소드 패턴을 사용하면 클래스 인스턴스 만드는 일을 서브클래스에게 맡기게 된다.

추상 팩토리 패턴(Abstract Factory Pattern)
구상 클래스에 의존하지 않고도 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생산하는 인터페이스를 제공
구상 클래스는 서브클래스에서 만든다.

간단한 팩토리(Simple Factory)
디자인 패턴이라기 보다는 프로그래밍에서 자주 쓰이는 관용구에 가깝다.
정확히는 패턴은 아니다.

싱글턴 패턴(Singleton Pattern) 
클래스 인스턴스를 하나만 만들어 그 인스턴스로의 전역 접근을 제공

커맨드 패턴(Command Pattern)
요청 내역을 객체로 캡슐화해서 객체를 서로 다른 요청 내역에 따라 매개변수화할 수 있다.
요청을 큐에 저장하거나 로그로 기록하거나 작업 취소 기능을 사용할 수 있다.

어댑터 패턴(Adapter Pattern)
특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환한다.
인터페이스가 호환되지 않아 같이 쓸 수 없었던 클래스를 사용할 수 있게 도와준다.

퍼사드 패턴(Facade Pattern)
서브 시스템에 있는 일련의 인터페이스를 통합 인터페이스로 묶어준다.
또한 고수준 인터페이스도 정의하므로 서브 시스템을 더 편리하게 사용할 수 있다.

템플릿 메소드 패턴(Template Method Pattern)
알고리즘의 골격을 정의
템플릿 메소드를 사용하면 알고리즘의 일부 단계를 서브클래스에서 구현할 수 있다.
알고리즘의 구조는 그대로 유지하면서 알고리즘의 특정 단계를 서브클래스에서 재정의할 수도 있다.

컴포지트 패턴(Composite Pattern)
객체를 트리구조로 구성해서 부분-전체 계층구조를 구현
컴포지트 패턴을 사용하면 클라이언트에서 개별 객체와 복합 객체를 똑같은 방법으로 다룰 수 있다.

반복자 패턴(Iterator Pattern)
컬렉션의 구현 방법을 노출하지 않으면서 집합체 내의 모든
항목에 접근하는 방법을 제공

상태 패턴(State Pattern)
객체의 내부 상태가 바뀜에 따라서 객체의 행동을 바꿀 수 있다.
마치 객체의 클래스가 바뀌는 것과 같은 결과를 얻을 수 있다.

프록시 패턴(Proxy Pattern)
특정 객체로의 접근을 제어하는 대리인(특정 객체를 대변하는 객체)을 제공
보호 프록시(Protection Proxy)
접근 권한을 바탕으로 객체로의 접근을 제어하는 프록시
방화벽 프록시(Firewall Proxy)[일련의 네트워크 자원으로의 접근을 제어, 주제를 나쁜 클라이언트로부터 보호]
스마트 레퍼런스 프록시(Smart Reference Proxy)[주제가 참조될 때마다 추가 행동을 제공]
캐싱 프록시(Caching Proxy)[비용이 많이 드는 작업의 결과를 임시로 저장한다. 여러 클라이언트에서 결과를 공유하게 해 줌으로써 계산 시간과 네트워크 지연을 줄여 주는 효과도 있다.]
동기화 프록시(Synchronication Proxy)[여러 스레드에서 주제에 접근할 때 안전하게 작업을 처리할 수 있게 해 준다.]
복잡도 숨김 프록시(Complexity Hiding Proxy)[복잡한 클래스의 집합으로의 접근을 제어하고, 그 복잡도를 숨겨 준다. 퍼사드 프록시(Facade Proxy)라고 부르기도 한다.
이 프록시와 퍼사드 패턴의 차이점은 프록시는 접근을 제어하지만 퍼사드 패턴은 대체 인터페이스만 제공한다.]
지연 복사 프록시(Copy-On_Write Proxy)[클라이언트에서 필요로 할 때까지 객체가 복사되는 것을 지연시킴으로써 객체의 복사를 제어한다. 변현된 가상 프록시다.]

브리지 패턴(Brighe Pattern)
구현과 인터페이스를 완전히 결합하지 않았기에 구현과 추상화 부분을 분리 독립적으로 확장 가능
구상 클래스가 바뀌어도 클라이언트에는 영향을 미치지 않음 
여러 플랫폼에서 사용해야 하는 그래픽스와 윈도우 처리 시스템에서 유용하게 사용
인터페이스와 실제 구현할 부분을 서로 다른 방식으로 변경해야 할 때 유용함

빌더 패턴(Builder Pattern)
복합 객체 생성 과정을 캡슐화
여러 단계와 다양한 절차를 거쳐 객체를 만들 수 있다
제품의 내부 구조를 클라이언트로부터 보호할 수 있다
클라이언트는 추상 인터페이스만 볼 수 있기에 제품을 구현한 코드를 쉽게 바꿀 수 있다 
복합 객체 구조를 구축하는 용도로 쓰임

책임 연쇄 패턴(Chain of Responsibility Pattern)
요청을 보낸 쪽과 받는 쪽을 분리
객체는 사슬의 구조를 몰라도 되고 그 사슬에 들어있는 다른 객체의 직접적인 레퍼런스를 가질 필요도 없으므로 객체가 단순화
사슬에 들어가는 객체를 바꾸거나 순서를 바꿈으로써 역할을 동적으로 추가,제거 가능

플라이웨이트 패턴(Flyweight Pattern)
실행 시에 객체 인스턴스의 개수를 줄여서 메모리를 절약할 수 있다.
여러 가상 객체의 상태를 한곳에 모아 둘 수 있다.
어떤 클래스의 인스턴스가 아주 많이 필요하지만 모두 똑같은 방식으로 제어해야 할 때 유용

인터프리터 패턴(Interpreter Pattern)
문법을 클래스로 표현해서 쉽게 언어를 구현할 수 있음
문법이 클래스로 표현되므로 언어를 쉽게 변경하거나 확장 가능

중재자 패턴(Mediator Pattern)
시스템과 객체를 분리함으로써 재사용성을 획기적으로 향상시킬 수 있음
제어 로직을 한 군데 모아놔서 관리가 수월
시스템에 들어있는 객체 사이에서 오가는 메시지를 줄이고 단순화 가능
서로 연관된 GUI 구성 요소를 관리하는 용도로 많이 쓰임

메멘토 패턴(Memento Pattern)
저장된 상태를 핵심 객체와는 다른 별도의 객체에 보관 가능
핵심 객체의 데이터를 계속해서 캡슐화된 상태로 유지 가능
복구기능을 구현하기 쉬움

프로토타입 패턴(Prototype Pattern)
클라이언트는 새로운 인스턴스를 만드는 과정을 몰라도 된다.
클라이언트는 구체적인 형식을 몰라도 객체를 생성할 수 있음
상황에 따라 객체를 새로 생성하는 것보다 객체를 복사하는 것이 더 효율적일 수 있음
시스템에서 복잡한 클래스 계층구조에 파묻혀 있는 다양한형식의 객체 인스턴스를 새로 만들어야 할 때 유용하게 쓸 수 있음

비지터 패턴(Visitor Pattern)
구조를 변경하지 않으면서도 복합 객체 구조에 새로운 기능을 추가할 수 있음
비교적 손쉽게 새로운 기능을 추가할 수 있음
비지터가 수행하는 기능과 관련된 코드를 한곳에 모아 둘 수 있음
비지터를 사용하면 복합 클래스의 캡슐화가 꺠짐



