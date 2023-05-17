package programmers;

import java.util.Arrays;

/*
문자열 my_string과 정수 s, e가 매개변수로 주어질 때, 
my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 
return 하는 solution 함수를 작성해 주세요.*/
public class Thirteen {

	public static void main(String[] args) {
		String my_string = "Progra21Sremm3"	; 
		int s = 6;
		int e = 12;
		String answer = "";
		String[] strArr = my_string.split("");
		String temp = "";
		
		
		for (int j=0;j<s;j++) {
			temp += strArr[j];
		}
		for (int j=e;j>s-1;j--) {
			temp += strArr[j];
		}
		for (int j=e+1;j<strArr.length;j++) {
			temp += strArr[j];
		}
		System.out.println(temp);
	}

}
