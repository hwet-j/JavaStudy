package chap0304;

public class Check02_3 {

	public static void main(String[] args) {
		// while문과 Math.random()메소드를 이용해서 2개의 주사위를 던졌을 때
		// 결과를 (결과1, 결과2) 형식으로 출력하고 합이 5가아니면 주사위를 계속 던지고
		// 합이 5면 종료하는 코드를 작성.
		int num1;
		int num2;
		while (true) {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			System.out.printf("(%d, %d)\t", num1, num2);
			if (num1 + num2 == 5) {
				break;
			}
		}
		

	}

}
