package chap0304;

import java.util.Scanner;

public class Check02_7 {

	public static void main(String[] args) {
		/*
		 while, Scanner를 사용하여 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성 
		 */
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		int num2;
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 / 2.출금 / 3. 잔고 / 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("얼마를 예금 하시겠습니까? : ");
				num2 = sc.nextInt();
				balance += num2;
				break;
			case 2:
				System.out.print("얼마를 출금 하시겠습니까? : ");
				num2 = sc.nextInt();
				if (balance - num2 <0) {
					System.out.println("금액이 부족합니다.");
				} else {
					balance -= num2;
					System.out.println("출금액 >" + num2);
				}
				break;
			case 3:
				System.out.println("잔고 : " + balance);
				break;
			case 4:
				System.out.println("\n프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못선택하셨습니다.");
				break;
			}
			
		}
		
		

	}

}
