package chap02;

// 정수 연산에서의 자동타입변환
// byte - short - int -long - float - double
public class VarEx07_p76 {

	public static void main(String[] args) {
		int r1 = 10 + 20;
		System.out.println("r1 = " + r1);

		short a = 10;
		short b = 20;
		System.out.println(a + b); // 30
//		short r2 = a+b;	// 정수타입의 변수에 연산(+-*/%)이 존재하면 연산은 기본형(int)으로 부터 시작한다.(int로 시작하기 때문에 하위개념인 short로 자동변환 불가)
		// 더 작은형태에서만 기본형으로 변환되며 그이상(long)이 존재 경우는 가장큰 타입형으로 연산된다.
//		System.out.println(r2); 		// 오류
		// Ex) --> 오류가 발생하지 않으려면r2의 타입을 int이상의 타입으로 설정해야 한다.
		int r3 = a + b;
		long r4 = a + b;
		float r5 = a + b;
		double r6 = a + b;
		System.out.println("int 타입 r3 = " + r3); // 30
		System.out.println("long 타입 r4 = " + r4); // 30
		System.out.println("float 타입 r5 = " + r5); // 30.0
		System.out.println("double 타입 r6  = " + r6); // 30.0
		System.out.println("====================");
		System.out.println("int이하의 타입에서 연산을 진행하면 전부 int로 변환되어 연산된다. \n");

		// 실수형 테스트
		float f1 = 3.145F;
		float f2 = 6.446f;
		float f3 = f1 + f2; // 실수형은 연산이있어도 실수의 기본형인 double로 변환되지 않는듯 함.
		System.out.println(f3+"\n");
		double f4 = 5.151;
		//		float f5 = f1 + f4;  // 연산시에 가장큰 타입으로 계산되므로 우측 연산결과는 double이다.
		System.out.println("==========\n실수형의 경우는 float끼리 연산시 float이며 double이 존재하면 double형으로 연산된다.\n");

		// =======================================
		int c = 100;
		long d = 3;
		//		int r7 = c/d;	// long 타입에서 int 타입으로 변환할 수 없음
		long r8 = c / d; // long , float double 만 가능하다.
		System.out.println("r8 =" + r8); // 33

		float r9 = c / d;
		System.out.println("r9 =" + r9); // 33.0
		double r10 = c / d;
		System.out.println("r10 =" + r10); // 33.0
		// ==> 100/3의 결과인 실수는 33.3333 의 결과가 맞지만 연산과 형변환의 순서를 고려하여 값을 예측해야한다.
		// 변수 c,d의 연산과정시 큰 타입인 d에 맞게 long타입으로 연산이 진행되며 결과는 long타입의 33이 도출되며
		// 그 이후에 실수형(float, double)변환이 일어나기 때문에 33.0이라는 결과가 나온다.
		System.out.println("==========\n전체적인 결과를 확인하면 int 이하의 타입은 int형으로 변환되어 계산되고,");
		System.out.println("그 이상의 타입에서는 더 큰 타입을 기준으로 연산되는 것을 확인할 수 있다.");
		System.out.println("실수와 정수타입이 둘다 사용된다면 특히나 연산의 순서를 잘 확인해 결과를 예측해야함. \n");
		
		// int형과 long의 연산에서 굳이 int타입으로 계산하여 결과를 int타입의 변수에 저장하고 싶을 경우(의미없어보임)
		int r11 = c / (int) d;
		System.out.println("int r11 = " + r11);		// 33

	}

}
