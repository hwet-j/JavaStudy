package programmers;


import java.util.*;


/* 정수 리스트 num_list와 정수 n이 주어질 때,
n 번째 원소부터 마지막 원소까지의 모든 원소를 담은
리스트를 return하도록 solution 함수를 완성해주세요.
*/
public class _26 {
	public static void main(String[] args) {
		int[] num_list = {2, 1, 6};
		int n = 3;
		int leng = num_list.length - n + 1;

		int[] answer = new int[leng];

		for (int i = 0; i < leng; i++){
			answer[i] = num_list[i+n-1];
		}

		System.out.println(Arrays.toString(answer));
	}
}

// 특정 위치부터 마지막 위치까지 봅아내는 문제로 매우 간단한 문제이다.
