package chap0304;

import java.util.Scanner;

// for문을 사용한 구구단 출력 -> 전체 출력( 2~9단 )

public class ForEx04_p153 {

	public static void main(String[] args) {
		for (int dan=2; dan<10; dan++) {
			System.out.printf("\n<%d단 출력>\n", dan);
			for (int i=1;i<10;i++) {
				System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
			}
		}

		
	}

}
