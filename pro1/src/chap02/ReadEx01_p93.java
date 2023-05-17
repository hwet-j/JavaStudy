package chap02;

import java.io.IOException;

// 키보드로 부터 입력된 내용을 변수에 저장 : System.in.read() --> 이것 이외에 여럿 존재함.
public class ReadEx01_p93 {
	public static void main(String[] args) throws IOException {		// 추가 공부 필요. (교재 10장)
//			int keyCode = System.in.read();
//			System.out.println("입력된 내용 :" + keyCode); 	// System.in.read() 의 리턴값은 int
			
			// 여러번 반복 작업을 하고싶으면 선언과 초기값설정을 함께 하지않고 선언만 하고 값설정만 반복해주면된다.
			int keyCode2;
			// 반복문 사용 X
			keyCode2 = System.in.read();
			System.out.println("입력한내용 : " + keyCode2);
			keyCode2 = System.in.read();
			System.out.println("입력한내용 : " + keyCode2);
			keyCode2 = System.in.read();
			System.out.println("입력한내용 : " + keyCode2);
			keyCode2 = System.in.read();
			System.out.println("입력한내용 : " + keyCode2);
			keyCode2 = System.in.read();
			System.out.println("입력한내용 : " + keyCode2);
			// 이상태에서 한번의 입력을 해주어도 여러개의 입력값이 적용되는데 그 이유는 Enter키를 쳐주면서
			// \r (캐리지 리턴)과 \n(라인피드) 의 입력되어 입력한 내용의 추가적으로 2개의 입력값이 출력되는 것이다.
			// 13의 결과는 \r을 의미하고, 10의 의미는 \n을 의미한다.
			
	}

}


/* 이처럼 특정 문구에만 작성가능하지만 위처럼 전체 문구에 적용가능
public class ReadEx01_p93 {
	public static void main(String[] args) {
		try {
			int keyCode = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}
}
 */
