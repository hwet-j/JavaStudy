package chap10;

/*
메서드 내부에서 예외 발생소지의 코드 작성시 try~catch 블럭으로 예외 처리 가능하다.
throws 키워드를 사용하여 메서드를 호출한 곳으로 예외처리를 떠넘길 수 있다. (처리하는게 아님 떠넘기는 것)
메서드명() throws 예외클래스1, 예외클래스2.... {
	// 실행 코드
}
*/
public class ThrowsMain2_p462 {

	public static void main(String[] args){
		System.out.println("main");
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("예외 발생");
			// e.printStackTrace();
		}
		System.out.println("findClass()호출 후");


	}

	
	public static void findClass() throws ClassNotFoundException {
		System.out.println("findClass()");
		Class.forName("java.lang.String2");  // DB연동할 시에 사용함
		//System.out.println("예외 발생");
	}
}
