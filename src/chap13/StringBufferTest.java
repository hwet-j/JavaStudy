package chap13;

public class StringBufferTest {

	public static void main(String[] args) {
		// String클래스와 달리 내용을 변경할 수 있다.
		StringBuffer sb = new StringBuffer("김구");	// 따로 import 하지 않아도 일반 환경 내에서 사용가능(lang패키지 내에있음)
		
		System.out.println("sb = " + sb);
		System.out.println("sb.hachCode() = " + sb.hashCode());
		sb.append("지도자");
		System.out.println("sb = " + sb);
		System.out.println("sb.hachCode() = " + sb.hashCode());
		// sb의 값이 변했음에도 불구하고 해시코드 값이 변하지 않았다.
	}

}
