package programmers;

import java.util.Arrays;

/*정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 
 * 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 
 * 차례대로 a, b, c라고 할 때, 
 * n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
*/
public class _21 {
	public static void main(String[] args) {
		int n = 1;
		int[] slicer = {1,5,2}; 
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] answer;
		int cnt = 0;
		
		if (n == 1) {
			answer = new int[slicer[1]+1];
			for (int i = 0;i<slicer[1]+1;i++) {
				answer[i] = num_list[i];
			}
		} else if (n == 2) {
			answer = new int[num_list.length - slicer[0]];
			for (int i=slicer[0];i<num_list.length;i++) {
				answer[i-slicer[0]] = num_list[i];
			}
		} else if (n == 3) {
			answer = new int[slicer[1]-slicer[0]+1];
			for (int i=slicer[0];i<slicer[1]+1;i++) {
				answer[i-slicer[0]] = num_list[i];
			}
		} else {
			answer = new int[(slicer[1]-slicer[0])/slicer[2]+1];
			for (int i=slicer[0]; i<slicer[1]+1; i = i + slicer[2]) {
				answer[cnt++] = num_list[i];
			}
		}
		System.out.println(Arrays.toString(answer));
		
		
		
	}

}
