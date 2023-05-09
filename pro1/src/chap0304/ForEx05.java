package chap0304;

public class ForEx05 {

	public static void main(String[] args) {
		// 1 2 3 4 5
		for(int i=1; i<6; i++) {
			System.out.printf(i + "\t");
		}
		System.out.println();
		/* 문법상 오류는 없지만 무한루프에 빠짐
		int j=1;
		for (;;) {
			if (j<6) {
				System.out.println(j);
				j++;
			}
			j++;
		}
	 	*/
		
		int n = 1;
		while (n < 6) {
			System.out.println(n);
			n++;
		}
		
		
		
		
	}

}
