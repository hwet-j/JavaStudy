package chap0607;

/*
 final class : 하위(자식)클래스가 존재할 수 없다.
 final field : 선언 시 값을 초기화해야하며, 이후 초기값은 변경불가하다.
 final method : 오버라이딩 불가
 
 * */

public class Final01_p281 {
	//int a = 10;		// 클래스에서 선언된 변수(필드)는 메서드나 생성자에서 수정 가능하다.
	int a;				// 필드는 초기값을 설정하지 않아도 된다.
	// a = 100;			// 필드는 클래스영역에서 수정 불가
	final int b = 20;	// 불변 (final 키워드로 인해 값 수정 불가)
	// final int b;		// final 키워드로 선언된 필드는 선언과 동시에 초기화 해줘야한다.
	
	static final int c = 100;
	
	
	public Final01_p281() {
		//a = 100;	// 생성자 및 메서드 내에서 수정 가능
		//b = 100;	// final 키워드로 인해 값 수정 불가 (값을 할당할 수 없다고 함)
	}
	void test() {
		a = 100;
	}
	final void test2() {
		
	}

}

// 접근제어자 public사용 불가
class C1 extends Final01_p281{
	
	@Override		// @를 통한 Override 키워드를 통해서 사용자가 확인하기도 쉽고, 오버라이딩 가능한지 체크해준다. (리턴타입이나 변수명, 매개변수가 다르면 에러)
	void test() {
		System.out.println("부모클래스의 test()를 오버라이딩");
	}

	//@Override	// final 매서드는 오버라이딩 불가
	//void test2() {};
}	

// final 클래스의 상속? -> 부모 클래스가 될 수 없다.
//final class Final02{}
//class C2 extends Final02{}		// 에러발생








