package db_service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DBMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = -1;
		DeptService a = new DeptService();
		String dname = "";
		String loc = "";

		System.out.println("---- 부서 관리 시스템 ----");
		while (true) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("0.종료");
			System.out.println("1.모든부서조회");
			System.out.println("2.부서상세조회");
			System.out.println("3.부서목록조회");
			System.out.println("4.부서정보입력");
			System.out.println("5.부서정보삭제");
			System.out.println("6.부서정보수정");
			System.out.print("번호 입력 : ");
			menuNo = scanNum();
			if (menuNo == 1) {
				for (DepartmentDTO item : a.detpAllList()) {
					System.out.println(item.toString());
				}
			} else if (menuNo == 2) {
				System.out.print("조회할 부서 입력 :");

				int bNo = scanNum();

				for (DepartmentDTO item : a.detpPartList(bNo)) {
					System.out.println(item.toString());
				}

			} else if (menuNo == 3) {
				for (String item : a.deptNameList()) {
					System.out.println(item);
				}
			} else if (menuNo == 4) {
				System.out.print("부서명 입력 : ");
				dname = sc.next();
				System.out.print("부서위치 입력 : ");
				loc = sc.next();

				a.insertDept(dname, loc);
			} else if (menuNo == 5) {
				System.out.print("조회할 부서 입력 :");

				int bNo = scanNum();

				for (DepartmentDTO item : a.detpPartList(bNo)) {
					System.out.println(item.toString());
				}
			} else if (menuNo == 6) {
				System.out.print("수정할 부서번호 입력 : ");
				int bNo = scanNum();
				System.out.print("수정할 부서이름 입력 : ");
				dname = sc.next();
				System.out.print("수정할 부서위치 입력 : ");
				loc = sc.next();
				
				a.updateDept(loc, dname, bNo);
			} else if (menuNo == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바르지 않은 번호입력");
				continue;
			}

		}

	}

	// 번호 입력을 위한 메서드 - 문자를 입력하면 반복
	public static int scanNum() {
		Scanner sc = new Scanner(System.in);
		int number = 0;

		while (true) {
			try {
				number = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자가 입력되지 않았습니다.");
				sc.nextLine(); // 작성해주지 않으면 버퍼가 남아있어 에러상태를 지속적으로 유지함
				continue;
			}
			break;
		}
		System.out.println();
		return number;
	}

}
