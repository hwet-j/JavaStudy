package programmers;


import java.util.Arrays;


/*
정수 리스트 num_list와 정수 n이 주어질 때,
num_list를 n 번째 원소 이후의 원소들과 n 번째까지의
원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의
원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.

*/
public class _27 {
	public static void main(String[] args) {
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		int leng = num_list.length ;

		int[] answer = new int[leng];

		for (int i = n; i < leng; i++){
			answer[i-n] = num_list[i];
			System.out.println(num_list[i]);
		}
		System.out.println(Arrays.toString(answer));

		for (int i = 0; i < n; i++){
			System.out.println(num_list[i]);
			System.out.println(Arrays.toString(answer));
			answer[leng-n+i] = num_list[i];
		}

		System.out.println(Arrays.toString(answer));
	}
}

// 이 문제는 순서를 바꾸는 문제로 배열의 길이에는 변화가 오지 않는다.
// 두번의 입력을 진행해야 하기 때문에 2개의 for문을 따로 작성하였으며
// 첫번째 for문에는 n번째 index부터 마지막 index까지 새로운 배열에 0 번쨰 index부터 입력을 해준다.
// 두번째 for문에는 0번째 index부터 n-1번째 index까지 새로운 배열에 첫번째 배열에 입력된 다음 배열부터 입력한다.
