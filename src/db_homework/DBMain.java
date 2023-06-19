package db_homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DBMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = -1;
		EmployeeService a = new EmployeeService();

		System.out.println("---- 부서 관리 시스템 ----");
		while (true) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("0.종료");
			System.out.println("1.모든직원조회");
			System.out.println("2.직원상세조회");
			System.out.println("3.직원정보입력");
			System.out.println("4.직원정보수정");
			System.out.println("5.직원정보삭제");
			System.out.print("번호 입력 : ");
			menuNo = scanNum();
			if (menuNo == 1) {
				for (EmployeeDTO item : a.selectAllList()) {
					System.out.println(item.toString());
				}
			} else if (menuNo == 2) {
				System.out.print("조회할 부서 입력 :");

				int bNo = scanNum();

				for (EmployeeDTO item : a.selecPartList(bNo)) {
					System.out.println(item.toString());
				}

			} else if (menuNo == 3) {
				System.out.print("직원번호 입력 : ");
				int empNO = scanNum();
				System.out.print("직원이름 입력 : ");
				String eName = sc.next();
				System.out.print("직원업무 입력 : ");
				String job = sc.next();
				System.out.print("직속상관 직원번호 입력 : ");
				int mgr = scanNum();
				System.out.print("입사날짜 입력 : ");
				String h_date = sc.next();
				System.out.print("연봉 입력 : ");
				int sal = scanNum();
				System.out.print("보너스 입력 : ");
				int comm = scanNum();
				System.out.print("부서번호 입력 : ");
				int deptNo = scanNum();
				
				a.insertEmpData(empNO, eName, job, mgr, h_date, sal, comm, deptNo);
			} else if (menuNo == 4) {
				System.out.print("수정할 직원번호 입력 : ");
				int empNO = scanNum();
				System.out.println("---수정데이터 입력---");
				System.out.print("직원업무 입력 : ");
				String job = sc.next();
				System.out.print("연봉 입력 : ");
				int sal = scanNum();
				System.out.print("보너스 입력 : ");
				int comm = scanNum();
				a.updateEmpData(empNO, job, sal, comm);
			} else if (menuNo == 5) {
				System.out.print("삭제할 직원번호 입력 : ");
				int empNO = scanNum();
				a.deleteEmpData(empNO);
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
