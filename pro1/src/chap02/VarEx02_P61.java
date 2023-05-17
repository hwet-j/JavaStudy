package chap02;

public class VarEx02_P61 {
	public static void main(String[] args) {
		// 변수선언: 데이터타입 변수명'
		int number;
		int number2;
		int number3;

		// 초기값 할당: 변수명 = 초기값; ==> 변수의 선언이후에 사용가능
		number = 12354;
		System.out.println(number);

		// 강제 형변환 선언을 int로 했지만 초기값 설정을 실수형으로 설정했기 때문에 오류가 발생한다.
		// number2 = 123.56;		//Type mismatch: cannot convert from double to int
		number2 = (int) 123.56; // int형으로 형변환을 해준다.(강제형변환)
		System.out.println(number2);
		
		// byte는 -128 ~ 127 
		// byte byte1 = 128;	// Type mismatch: cannot convert from int to byte
		
		// 범위 내에 있어도 실수인가 정수인가에 따라 형이 달라 오류가 발생할 수도있고, 
		// 범위 밖의 값을 초기화 값으로 설정하여 오류가 발생할 수 있음. 

	}

}
