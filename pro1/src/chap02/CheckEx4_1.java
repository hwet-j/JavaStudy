package chap02;

public class CheckEx4_1 {

	public static void main(String[] args) {
		/* 다음과 같이 출력 되도록 코드 작성
		 * 이름 : 김자바
		 * 나이 : 25
		 * 전화 : 010-123-4567
		 */
		String name = "김자바";
		int age = 25;
		String tel1 = "010", tel2 ="123", tel3 = "4567";
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age + "\n");
		System.out.printf("전화 : %s - %s - %s", tel1, tel2, tel3);

	}

}
