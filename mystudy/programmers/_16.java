package programmers;

import java.util.Arrays;

/*알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, 
 * my_string에서 'A'의 개수, my_string에서 
 * 'B'의 개수,..., my_string에서 'Z'의 개수, 
 * my_string에서 'a'의 개수, my_string에서 
 * 'b'의 개수,..., my_string에서 'z'의 개수를 
 * 순서대로 담은 길이 52의 정수 배열을 return 하는 
 * solution 함수를 작성해 주세요.*/
public class _16 {
	public static void main(String[] args) {
		String my_string ="Programmers";
		int[] answer = new int[52];
		String[] strArr = my_string.split("");
		System.out.println(my_string.length());
		int j = 0;		
		
		for (int i=0; i<strArr.length; i++) {
			j = (int)my_string.charAt(i) - 65;
			System.out.println(j);
			if(j > 30) {
				answer[j-32+26] += 1;
			} else {
				answer[j] += 1;
			}
		}
		System.out.println(Arrays.toString(answer));
		
	}

}
