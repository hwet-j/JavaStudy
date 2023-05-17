package chap0304;

// for문 - 합계 구하기
public class ForEx02_p151 {

	public static void main(String[] args) {
		// 1부터 5까지의 정수 합 ?
		int sum=0;
		for (int i=1; i<6;i++) {
			sum += i;
//			System.out.println(i + "일때의 sum의 값 = " + sum);
		}
		System.out.println("총합 = " + sum);

	}

}
