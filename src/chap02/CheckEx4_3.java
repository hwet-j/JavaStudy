package chap02;

import java.io.IOException;
import java.util.Scanner;

public class CheckEx4_3 {
	public static void main(String[] args) throws IOException{
		/*
		 * [필수 정보 입력]
		 * 1. 이름 : _________
		 * 2. 주민번호 앞 6자리 : __________
		 * 3. 전화번호 : __________
		 * 
		 * ------------------------
		 * 입력 내용
		 * 홍길동
		 * 123456
		 * 010-1234-1234
		 */
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String str1, str2, str3;
		
		while (true) {
			if (num == 0) {
				System.out.println("[필수 정보 입력]");
				System.out.print("1. 이름 :");
				str1 = sc.nextLine();
			}
			if (num == 1) {
				System.out.print("2. 주민번호 앞 6자리 :");
				str2 = sc.nextLine();
			}
			if (num == 2) {
				System.out.print("3. 전화번호 :");
				str2 = sc.nextLine();
			}
			if (num==3) {
				System.out.println("종료.");
				break;
			}
			num += 1;
		}
		
	}

}
