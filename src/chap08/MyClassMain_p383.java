package chap08;

//p383 - 인터페이스 사용
public class MyClassMain_p383 {

	public static void main(String[] args) {
		
		//클래스의 필드에 선언된 인터페이스 사용
	/*	MyClass_p382 mc1 = new MyClass_p382();
		System.out.println(mc1.rc.MAX_VOLUME);//10
		mc1.rc.turnOn();//TV를 turnOn()
		System.out.println("---------");*/
		
		//생성자의 매개변수에 선언된 인터페이스 사용
		MyClass_p382 mc1 = new MyClass_p382();
		System.out.println("---------");
		
		//클래스 생성자의 매개변수에 선언된 인터페이스 사용
		MyClass_p382 mc2 = new MyClass_p382(new Audio());
		System.out.println("---------");
		
		// 메서드의 매개변수에 선언된 인터페이스 사용
		MyClass_p382 mc3 = new MyClass_p382();
		mc3.test1(new Audio());
		System.out.println("---------");
		
		// 메서드의 지역변수에 선언된 인터페이스
		mc3.test2();
		
	}

}










