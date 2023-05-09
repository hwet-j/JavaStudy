package programmers;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int n=0;
		String control = "wsdawsdassw";
		// split 함수에 공백문자를 지정
		String[] strArray = control.split("");

		for(String s : strArray) {
			if (s.equals("w")) {
				n += 1;
			} else if (s.equals("s")) {
				n -= 1;
			} else if (s.equals("d")) {
				n += 10;
			} else {
				n -= 10;
			}
		}
        
		System.out.println(n);
		
	}

}
