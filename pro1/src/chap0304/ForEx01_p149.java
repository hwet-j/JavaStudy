package chap0304;

import chap02.Printf_P91;

/*
*	for (초기값; 조건식; 증감식) {
* 		반복실행문
* }
*/

//자바의 배열의 경우는 index번호가 0번부터 시작한다.
public class ForEx01_p149 {

	public static void main(String[] args) {
		// 반복문 작성
		for (int i = 0; i < 10; i++) {
			System.out.println("반복문 실행중 " + i);
		}
		System.out.println("\n\n===========");

		// 0 1 2 3 4 5 6 7 8 9
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "\t");
			System.out.printf("%d", i);
		}
		System.out.println("\n\n===========");

		// 5 4 3 2 1
		for (int i = 5; i > 0; i--) {
			System.out.print(i + "\t");
		}
		System.out.println("\n\n===========");

		// 9 8 7 6 5 4 3 2 1 0
		for (int i = 9; i > -1; --i) {
			System.out.print(i + "\t");
		}
		
		
		

	}

}
