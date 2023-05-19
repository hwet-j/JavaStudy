package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*문자열 my_string과 정수 배열 indices가 주어질 때, 
 * my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 
 * 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.*/
public class _18 {
	public static void main(String[] args) {
		String my_string = "apporoograpemmemprs"; 
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

		List<String> strList = new ArrayList();
		for (String s:my_string.split("")) {
			strList.add(s);
		}
		int cnt = 0;
		Integer[] tmp = Arrays.stream(indices).boxed().toArray(Integer[]::new);
	    Arrays.sort(tmp, Comparator.reverseOrder()); // 내림차순
		
		
		System.out.println(Arrays.toString(tmp));
		for (int i:tmp) {
			strList.remove(i);
		}
		
		System.out.println(strList);
		
		String answer = "";
		for (String s:strList) {
			answer += s;
		}
		System.out.println(answer);
	}

}
