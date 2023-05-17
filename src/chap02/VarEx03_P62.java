package chap02;


// long 타입 변수
public class VarEx03_P62 {
	public static void main(String[] args) {
		long var1 = 10;
		System.out.println(var1);
		
		// long var2 =10000000000;	// The literal 10000000000 of type int is out of range 
		// 기본적으로 컴파일러는 정수리터럴을 int로 간주하는데 int의 허용범위를 초과할 경우
		// long타입임을 컴파일러에게 알려주어야 하는데 정수뒤에 l 또는 L (소문자 또는 대문자)
		// 를 입력하여 리터럴형변환하여 준다.
		// 같은 방식으로 float 타입을 알려주기 위해서는 f 또는 F를 입력해주면 된다.
		long var3 =10000000000l;		
		
	}
}
