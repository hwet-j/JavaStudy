package chap02;

import java.util.Scanner;

// 키보드에서 입력된 내용을 문자열로 얻기 : Scanner 클래스를 이용
public class ScannerEx01_p96 {

	public static void main(String[] args) {
		// 클래스의 객체를 생성하여 참조변수에 할당
		// 클래스타입 참조변수 = new 클래스명();
//		Scanner scanner = new Scanner();		// 생성자가 정의 되지 않음.
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String str = scanner.nextLine();
			System.out.println("입력한 문자열 = " + str);
			if (str.equals("q")) {
				System.out.println("반복문을 종료합니다.");
				break;
			}
		}
		// 문자열에서 == 가아닌 equals 함수 사용
		// equals 메소드는 비교하고자하는 대상의 내용을 비교
		// == 연산자는 주소값을 비교
		

	}

}
