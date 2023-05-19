package chap08;

//p382
/*클래스 선언시
 * 인터페이스는
 * 클래스의 필드에,
 * 생성자의 매개변수, 생성자의 지역변수 
 * 메서드의 매개변수, 메서드의 지역변수로 선언할 수 있다. */
public class MyClass_p382 {
	//필드
	RemoteControl rc = new Tv();
	
	//생성자
	//MyClass_p382(){}
	//생성자의 지역변수에 선언된 인터페이스
	MyClass_p382(){
		System.out.println("생성자의 지역변수에 선언된 인터페이스 실습중");
		RemoteControl rc1 = new Tv();
		rc1.turnOn();
		rc1.setVolume(2);
	}
	
	//생성자의 매개변수에 선언된 인터페이스
	MyClass_p382(RemoteControl rc){
		this.rc=rc;
		rc.turnOn();
		rc.setVolume(9);
	}
	
	//메서드의 매개변수에 선언된 인터페이스
	void test1(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(8);
	}
	
	//메서드의 지역변수에 선언된 인터페이스
	void test2() {
		RemoteControl rc= new Tv();
		rc.turnOn();
		rc.setVolume(10);
	}
	
}






















