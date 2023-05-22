package chap11;

// hashCode() : 객체의 해시코드를 반환하는 메서드
/*
Object 클래스의 hashCode() 메서드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴한다.
객체마다 다른 값을 가진다.

*/
public class Object_p474 {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.print("str1 == str2의 결과는 " + (str1 == str2));
		System.out.println("이다 그 이유는 new 키워드를 통해서 참조주소를 할당받지 않았기 때문이다.");
		// new로 새로 할당받지 않았으므로 두 변수명의 참조값은 동일하다.(주소값)
		System.out.println("str1.equals(str2)의 결과는 " + (str1.equals(str2)));
		// 해시 코드 확인하기
		System.out.println("str1의 해시코드 확인 " + str1.hashCode());		// 99162322
		System.out.println("str2의 해시코드 확인 " + str2.hashCode());		// 99162322
		// 해시코드가 동일하다 == 동일객체 == 객체의 주소가 동일하다.
		
		System.out.println("\n\n");
		
		// new 키워드는 값을 메모리에 할당시킨다.
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		
		
		System.out.print("str3 == str4의 결과는 " + (str3 == str4));
		System.out.println("이다. new를 통해 새로 메모리를 할당받았기 때문에 동일 객체를 참조하지 않는다.(주소값동일하지않음)");
		// 해시 코드 확인하기
		System.out.println("str3.equals(str4)의 결과는 " + (str3.equals(str4)));
		System.out.println("str3의 해시코드 확인 " + str3.hashCode());		// 99162322
		System.out.println("str4의 해시코드 확인 " + str4.hashCode());		// 99162322
		// --> 해시코드는 동일하다....--> String클래스에서는 hashCode()를 재정의하여 동일주소를 리턴 한다.
		
		System.out.println("\n\n");
		System.out.print("str1 == str3의 결과는 " + (str1 == str3));
		System.out.println("이다. new 키워드를 통해 새로 메모리를 할당 받았기 때문이다.(위의 이유와 동일)");
		// 해시 코드 확인하기
		System.out.println("str1.equals(str3)의 결과는 " + (str1.equals(str2)));
		System.out.println("str1의 해시코드 확인 " + str1.hashCode());		// 99162322
		System.out.println("str3의 해시코드 확인 " + str3.hashCode());		// 99162322
		// --> 해시코드는 동일하다....--> String클래스에서는 hashCode()를 재정의하여 동일주소를 리턴 한다.
		
		
	}

}
