package chap0304;

public class Check02_4 {

	public static void main(String[] args) {
		/*
		 for문의 중첩을 이용하여 4x + 5y = 60의 모든 해를 구해서 (x,y) 형태로 출력
		 단, x,y는 10이하의 자연수
		 */
		for (int i=1; i<11; i++) {
			for (int j=1;j<11; j++) {
				if (4*i + 5*j == 60) {
					System.out.printf("(%d, %d)\t", i, j);
				}
			}
		}
		
		

	}

}
