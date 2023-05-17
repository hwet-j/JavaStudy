package chap02;

// 강제 타입 변환 : 큰 허용범위타입을 작은 허용범위타입으로 강제로 나누어 저장하는 것.
// byte - short - int - long - float - double
// 데이터 타입 변수명 = (강제형변환타입) 변수명;
public class VarEx06_p74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v1 = 3.14;
//		float v2 = 3.14;		// 실수는 기본형이 double이라 컴파일 오류 발생
		System.out.println("v1 = " + v1);
		float v3 = (float)3.14;		// 강제형변환을 통하여 오류 해결
		float v4 = 3.14f;		// 이런 형태의 형변환은 리터럴형변환
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		double v5 = v4;
		System.out.println("v5 = " + v5); 	//  3.140000104904175
		// --> 컴퓨터는 계산시 2진법을 사용하여 계산하는데 10진법을 2진법으로 변환하는 과정을 거치면서
		// 소수중 일부는 무한소수가 되어버리는데 컴퓨터 메모리적 한계로 무한소수를 유한소수로 저장한다. 
		// 이런 변환과정에서 발생하는 오류가 이런 결과를 나타낸다.
		
		double v6 = 3.14;
		System.out.println("v6 = " + v6); 	//  3.14
		
		int v7 = (int) v5;		// 실수타입에서 정수타입으로 강제 형변환
		System.out.println("v7 = " + v7);
		
		// 유니코드는 숫자 (0~65535)를 2byte로 표현가능한 문자와 매핑한 국제 표준 규약
		int v8 = 44032;
		char v9 = (char)v8;
		System.out.println("44032의 int값 = " + v8);			// v8 = 44032
		System.out.println("44032의 char값 = " + v9);		// v9 = 가
		
		double testVal = 44032.211342;
		int testI = (int)testVal;
		char testC = (char)testVal;		// 실수를 char형으로 하면 알아서 int
		System.out.println("TestVal / double = " + testVal);
		System.out.println("TestVal / int = " + testI);
		System.out.println("TestVal / char = " + testC);
		
		int returnInt = (int) v9;		// char -> int로 강제 형변환
		System.out.println("returnInt = " + returnInt);
		
		
		
		
		
		
		

	}

}
