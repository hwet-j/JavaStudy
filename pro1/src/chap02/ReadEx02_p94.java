package chap02;

import java.io.IOException;

/*
while (조건문) { // 조건문 충족시 반복 실행
	반복실행코드
}

if (조건){	// 조건 충족시 실행
	// 실행 코드
}


--> while문 자체에서 반복문을 멈추게 할 수 있고, if문을 사용하여 while문을 중단 시킬 수 있다.
 		이때, 반복문을 종료하는 명령어는 break 이다.
 		
 조건문에서 값을 비교하는 법
 	- 비교연산자 > , < , >=, <= 등을 사용하여 비교 가능하다. 
 	- 프로그램 언어에서는 동일하다는 의미는 == 이며, 

 */

public class ReadEx02_p94 {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		// 만일 while문 조건문에 false형식의 조건이 들어가면 에러 발생
		// while문은 조건문을 충족했을 때 반복실행을 한다. (true)
		while ( true ) {
			// 반복실행
			keyCode = System.in.read();
			System.out.println(keyCode);
			
			
		}
		
	}
}
