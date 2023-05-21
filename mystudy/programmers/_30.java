package programmers;


/*
정수 리스트 num_list와 정수 n이 주어질 때,
num_list의 첫 번째 원소부터 마지막 원소까지
n개 간격으로 저장되어있는 원소들을 차례로 담은
리스트를 return하도록 solution 함수를 완성해주세요.
*/

public class _30 {
	public static void main(String[] args) {
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 2;
		int[] answer = new int[1 + (num_list.length - 1)/n];
		int cnt = 0;
		for (int i=0;i<num_list.length;i=i+n){
			answer[cnt++] = num_list[i];
		}



	}
}


// 길이설정
// 가장 첫 index값은 무조건 들어가아 하므로 1
// 첫 index를 제외하고 n개의 간격으로 입력되므로 numlist.length에서 1개를 뺸 값을 n으로 나눠준다.

// 배열에 입력
// for문에 i는 0부터 시작하여 +n의 간격으로 늘어나며 numlist.length전까지로 설정한다.
// index를 하나씩 입력해줘야 하므로 cnt라는 변수를 사용하여 하나씩 입력한다. 끗.
