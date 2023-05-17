package chap0304;

public class IfEx02_p125 {

	public static void main(String[] args) {
		// Math함수를 사용하여 n의 값 임의 추출
		int n = (int)Math.random();
		
		// Math함수를 이용해 원하는 범위의 값을 임의 추출 
		// (int)(Math.random() * 최대값) + 최소값;
		// (int)(Math.random() * 55) + 1; 		// 1~ 55
		// => 최대 최소라 작성하였지만 두 최대값의 경우 최소값을 고려하여 작성해야함.
		// (int)(Math.random() * (최대값)) + 최소값; 은 최대값은 실질적으로 최대값 + 최소값 -1 이다. 
		if (n % 2 == 0) {
			System.out.printf("n값은 %d로 짝수입니다.\n", n);
		} else {
			System.out.printf("n값은 %d로 홀수입니다.\n", n);
		}
		
		// 삼항연산자 
		// 조건 ? 참:거짓
		String answer = n % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		System.out.println(answer);
		
		System.out.println(n % 2 == 0 ? "짝수입니다." : "홀수입니다.");
		
		System.out.println((int)(Math.random() * 55) + 100);
	}

}
