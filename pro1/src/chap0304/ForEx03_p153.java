package chap0304;

import java.util.Scanner;

// for문을 사용한 구구단 출력
/* 출력결과
  5단
  5*1=5
  5*2=10
  ...
  ...
  5*8=40
  5*9=45
  */
public class ForEx03_p153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		System.out.printf("\n<%d단 출력>\n", dan);
		for (int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
		}

		
	}

}
