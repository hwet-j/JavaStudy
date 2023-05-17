package chap02;

// char타입 : 작은 따옴표' 로 감싼 문자리터럴
public class VarEx04_P63 {
	public static void main(String[] args) {
		char ch1 = 'a';
		System.out.println(ch1);
		
		char ch2 = '2';		// 숫자가 아닌 하나의 문자
		System.out.println(ch2);
		
		char ch3 = '꾹';
		System.out.println(ch3);
		
		int  int1 = 99;
		System.out.println(int1);
		
		// char 타입이지만 int형으로 초기값을 설정해도 오류가 발생하지 않으며 출력 또한 가능하다.
		char int2 = 99;
		System.out.println(int2);
		// ==> 이는 유니코드로 인식하여 설정된것이며 하나의 문자를 
		// 2byte로 표현할 수 있는 숫자 0~65535로 매핑한 국제 표준 규약이다.
		// p.64예제를 보면 좀 더 이해하기 쉬울듯함.
		
		// p.66 이스케이프 문자
		System.out.println("*** 이스케이프 문자 ***");
		System.out.println("- \\출력은 \\\\을 입력하여 출력가능하다.");
		System.out.println("- \\t는\t탭키(들여쓰기)");
		System.out.println("- \\n는\n줄바꾸기(unix 개행문자)");
		System.out.println("- \\r 은 \r캐리지 리턴(max  개행문자)");
		System.out.println("- \\r\\n 은 줄바꿈(windows 개행문자)");
		// 좀 더 자세한 것은 검색해보기 ( 굳이 정확히 알 필요는 업지만 \n라 라인피드 \r이 캐리지 리턴인 정도는 알아두는게 좋다)
		System.out.println("- \\를 사용해 \"와 \'의 출력도가능하다.");
		
		
		
		
	}
}
