package programmers;

import java.util.Arrays;

/*
어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 
예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 
사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
*/
public class Nine {

	public static void main(String[] args) {
		String my_string = "banana"	; 
		
		String[] strArr = my_string.split("");
		String[] answer = new String[strArr.length];
		String temp = "";
		
		for (int i=0;i<strArr.length;i++) {
			for (int j=i;j<strArr.length;j++) {
				temp += strArr[j];
			}
			answer[i] = temp;
			temp = "";
		}
		
		System.out.println(Arrays.toString(answer));
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
		
		
		
		
		
		
		
	}

}
