package chap02;

// 모니터 변수값 출력하기

/* 형식문자열
 * 정수 %d
 * 실수 %f
 *	문자열 %s
 * \n	\t		%%
 */
public class Printf_P91 {

	public static void main(String[] args) {
		// printf("형식문자열", 값1, 값2........)
		int v = 123;
		System.out.printf("v는 %d이다.", v);
		System.out.printf("v는\t %d이다.", v);		// printf는 줄바꿈을 하지 않는다.
		System.out.printf("v는\t %d이다.\n", v);	
		System.out.printf("정수%d\n", v);	
		System.out.printf("주소 : %d 번지\n", v);	
		System.out.printf("가격 : %d 원\n", v);	
		System.out.printf("가격 : %5d 원\n", v);	
		
		
		// 원의 넓이 구하기 
		int r = 6;
		double area = r * r * 3.14;
		System.out.printf("반지름 %d\n", r);
		System.out.printf("원의 넓이 = %f\n", area);
		System.out.printf("반지름 %d의 원의 넓이 = %f\n", r, area);
		System.out.printf("반지름 %d의 원의 넓이 = %8.2f\n", r, area);			// 자리수 설정
		
		String str = "원의 넓이";
		System.out.printf("반지름 %d의 %s = %f \n", r, str, area);

	}

}
