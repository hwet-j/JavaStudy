package chap02;
/*
 * # 데이터 타입
 * - 참조 타입 (reference type) : 주소 저장 => 배열 (Array), Class의 객체(object)
 * - 기본 타입 (primitive type) : 값 저장
 * 	==> 정수 : byte , short, int,  long
 * 			실수 : float, double
 * 			논리 : boolean
 * 			문자 : char (정수로 표현가능하여 정수형에 대입해도 무방 / 0~65535 -> 유니코드)
 * 
 * # 형변환
 * - 자동 형변환 : 큰 타입의 변수에 더 작은 타입의 변수를 넣어줄때 자동 형변환이 일어난다. 
 * 						연산작업을 진행할 때 더 큰 타입의 변수에 맞게 자동 형변환되어 연산된다. 
 * 						연산 작업시 int 이하의 타입은 int형으로 자동 형변환되어 연산된다.
 * - 강제 형변환 : 작은 타입의 변수에 더 큰 타입의 변수를 넣어주고 싶을때 강제 형변환을 시켜줘야 한다.  
 * - 리터럴 형변환 : 값f, 값F, 값l, 값L 
 * */

// + 연산에서의 문자열 자동 타입 변환
public class VarEx08_P82 {
	public static void main(String[] args) {
		int r1 = 10 * 10;		// 연산작업이 존재하므로 강제형변환을 해주지 않는 이상 r1은 최소 int타입이다.
		System.out.println(r1);	// 100
		
		// 연산의 진행 방식을 잘 파악하여 데이터의 형변환이 언제 일어나는지 파악 가능하다. 
		System.out.println(10 + 88 + ""); 		// int + int가 진행되고 문자열을 만나 결과 98이 나오지만 문자열 98을 리턴함
		System.out.println("" + 10 + 88);			// 최초 String 이 존재하여 뒤에 나오는 변수는 모두 String 취급 하여 1088이라는 문자열 리턴
		System.out.println(10 + "" + 88);			// int 10와 문자열이 만나 10 라는 문자열이 만들어진후 88이라는 문자열을 만나 1088이라는 문자열 리턴
		// ==> 3개의 값 모두 결과값의 타입은 문자열이므로 변수명으로 선언하고 싶다면 String 타입으로 선언해야한다. (이외 불가)
		
		String r2 = 10 + 10 + "99";
		System.out.println(r2);  // 2099
		
		r2 = "99" + (10 + 10);
		System.out.println(r2);  // 9920
		
		r2 = "99" + 10 * 10;
		System.out.println(r2);  // 99100
		// ==> 연산의 기본적인 순서를 지키면서 연산된다.
		
		// 문자열을 기본타입으로 강제 형변환
		// 래퍼(wrapper) 클래스 : 
		int price = 9900;
		String cnt = "5";		// 항상 숫자가 입력된다는 보장이 없음. 숫자형식의 문자열을 받았을 경우.
//		System.out.println("총 구매가격 = " + (price * cnt));		// 오류 : The operator * is undefined for the argument type(s) int, String
		// String을 -> int 형으로 변환해야 계산이 가능하다. 
		
		// String -> int
		int cnt2 = Integer.parseInt(cnt);		// 다른 변수에 넣어서 사용 가능
		System.out.println("총 구매가격(Int) = " + (price * Integer.parseInt(cnt)));		
		
		// String -> byte
		byte cnt3 = Byte.parseByte(cnt);
		System.out.println("총 구매가격(Byte) = " + (price * cnt3));		// 49500
		
		// String -> short
		short cnt4 = Short.parseShort(cnt);
		System.out.println("총 구매가격(Short) = " + (price * cnt4));
		
		// String -> long
		long cnt5 = Long.parseLong(cnt);
		System.out.println("총 구매가격(long) = " + (price * cnt5));
		
		// String -> float
		float cnt6 = Float.parseFloat(cnt);
		System.out.println("총 구매가격(float) = " + (price * cnt6));		// 49500.0
		
		// String -> double
		double cnt7 = Double.parseDouble(cnt);
		System.out.println("총 구매가격(double) = " + (price * cnt7));
		
		
		// String.valueOf(기본타입값) : 기본타입 -> String으로 강제 형변환
		String s1 = String.valueOf(10);
		System.out.println(s1);
//		System.out.println(s1 * 3);			// 타입을 확인하기 위해 * 연산자를 사용(오류발생시 문자열)
		
		String s2 = String.valueOf(10.114);
		System.out.println(s2);
		
		String s3 = String.valueOf(true);
		System.out.println(s3);
		
		
		
		
		
		
	}

}
