package programmers;

import java.util.Scanner;

/* 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다. */
public class _Three {

	public static void main(String[] args) {
		String str = "aBcDeFg";
		String result = "";
		for (int i=0; i<str.length(); i++){
			if ((int)str.charAt(i) > 92) {
				result += (char)((int)str.charAt(i) -32);
			} else {
				result += (char)((int)str.charAt(i) +32);
			}
        }
		System.out.println(result.toUpperCase());
		char ch = 'r';
		System.out.println(Character.toLowerCase(ch));

	}

}

