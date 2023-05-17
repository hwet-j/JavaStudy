package chap0304;

public class Check02_2 {

	public static void main(String[] args) {
		// for문을 이용해서 1부터 100까지 정수중 3의 배수의 총합을 구하는 코드 작성
		int sum=0;
		for (int i=1;i<101;i++) {
			if (i % 3==0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 총합 = " + sum);

	}

}
