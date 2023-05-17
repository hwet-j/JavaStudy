package chap0607;

// static(p.273) : 정적 맴버를 선언할 때 사용하는 키워드(예약어)
// 정적 맴버 : 클래승 고정된 멤버로 객체를 생성하지 않고 사용할 수 있는 필드와 메서드를 말한다. 이들을 각각 정적 필드, 정적 메서드 라고 한다. 
// ==> 클래스로더가 클래스를 로딩해서 메서드 메모리 영역에 적재할 때 클래스별로 관리
// ==> 클래스 로딩이 끝나면 바로 사용할 수 있다.
// 공용 데이터라면 정적 필드로 선언하기도 한다.

// 인스턴스 맴버 => 객체마다
public class Car04_p277 {
	// 객체 
	// [접근제어자] [제어자] 타입 변수명 [= 초기값];
	String color;
	static int maxspeed = 300;		// 객체의 경우 static으로 선언하면 italic체로 표시됨
	
	// 생성자
	// [접근제어자] 클래스명(매개변수리스트){~~~};
	
	// 메서드
	// [접근제어자] [제어자] 리턴타입 메서드명(매개변수리스트){~~~};
	static void powerOnOff() {		// static으로 선언했지만 italic체로 변하지 않는다. --> 메서드는 호출될 때 italic체
		System.out.println("OnOff");
	}
	
	

}