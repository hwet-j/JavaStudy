package programmers;

import java.util.Arrays;

/*정수 start와 end가 주어질 때, start에서 end까지 1씩 감소하는 수들을 차례로 담은 
 * 리스트를 return하도록 solution 함수를 완성해주세요.*/
public class _19 {
	public static void main(String[] args) {
		int start = 10;
		int end = 3;
		int[] intArr = new int[start-end+1];
		
		for (int i=start;i>=end;i--) {
			intArr[start-i] = i;
		}
		
		System.out.println(Arrays.toString(intArr));
	}

}
