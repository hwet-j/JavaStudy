package programmers;

import java.util.Arrays;

/* 정수 배열 arr가 주어집니다. 
 * 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 
 * return 하는 solution 함수를 완성해 주세요.

단, arr에 2가 없는 경우 [-1]을 return 합니다.
*/
public class _24 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 4, 5, 2, 9};
		int cnt = 0;
		int first = 100000;
		int last = 0;
		int[] answer;
		for (int i=0;i<arr.length;i++) {
			if (arr[i] == 2) {
				cnt += 1;
				if (first > i) {
					first = i;
				}
				if (last < i) {
					last = i;
				}
			}
		}
		if (cnt == 0) {
			answer = new int[]{-1};
		} else {
			answer = new int[last-first+1];
			for (int i=first;i<last+1;i++) {
				answer[i-first] = arr[i];
			}
		}
			
		System.out.println(Arrays.toString(answer));
		
		
		
	}

}
