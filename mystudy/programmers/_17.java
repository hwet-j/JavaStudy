package programmers;

import java.util.Arrays;

/*정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서
 *  k의 배수를 오름차순으로 저장한 배열을 
 * return 하는 solution 함수를 완성해 주세요.*/
public class _17 {
	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		int[] answer = new int[n-k];
		int cnt = 0;
		for (int i=1; i<n+1; i++) {
			if (i % k == 0) {
				System.out.println(i);
				answer[cnt++] = i;
			}
		}
		answer = Arrays.copyOf(answer, cnt);
		System.out.println(Arrays.toString(answer));
		
		
		
		
		
	}

}
