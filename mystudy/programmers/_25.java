package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 정수 배열 arr와 query가 주어집니다.

query를 순회하면서 다음 작업을 반복합니다.

짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 
배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 
배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 
solution 함수를 완성해 주세요.
*/
public class _25 {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5};
		int[] query = {4,1,2};
		List<Integer> arrList = new ArrayList<Integer>();
		for (int num : arr) {
			arrList.add(num);
		}
		int len = 0;
		for (int i=0; i< query.length; i++) {
			if (i % 2 == 0 ) {
				len = arrList.size();
				for (int j=query[i]+1; j<len;j++) {
					arrList.remove(query[i]+1);
				}
			} else {
				len = arrList.size();
				for (int j=0; j<query[i];j++) {
					arrList.remove(0);
				}
			}
			System.out.println(arrList);
		}
			
		int[] answer = new int[arrList.size()];
		
		for (int i = 0 ; i < arrList.size() ; i++) {
			answer[i] = arrList.get(i).intValue();
		}
		
	}

}
