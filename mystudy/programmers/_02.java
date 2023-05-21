package programmers;

/* 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요 */
public class _02 {

	public static void main(String[] args) {
		int n = 5;
		int com = n;
		int answer = 0;
		while(com > 0) {
			if (n % com == 0) {
				answer += com;
			}
			com -= 1;
		}
		System.out.println(answer);

	}

}
