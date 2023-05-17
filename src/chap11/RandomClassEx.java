package chap11;

import java.util.Random;

public class RandomClassEx {

	public static void main(String[] args) {
		// 객체 생성 
		// 클래스타입 변수명 = new 클래스명();
		Random random = new Random();
		for (int i=0;i<3;i++) {
			int v = random .nextInt();
			System.out.println("nextInt() : " + v);
		}
		
		long v2 = random.nextLong();
		System.out.println("nextLong() : " + v2);
		
		float v3 = random.nextFloat();
		System.out.println("nextFloat() : " + v3);
		
		double v4 = random.nextDouble();
		System.out.println("nextDouble() : " + v4);
		
		boolean v5 = random.nextBoolean();
		System.out.println("nextDouble() : " + v5);
		
		// random.,nextInt(num) ===> 0이상 num미만의 Int값을 리턴
		System.out.println("nextInt(12) : " + random.nextInt(12));
		
		// Random클래스명에 매개변수입력시 -> seed 설정
		Random random1 = new Random(20); // ==> seed설정
		
		for(int i = 0; i < 5; i++) {
			System.out.println(random1.nextInt(10)+1);
		}
		
		
	}

}
