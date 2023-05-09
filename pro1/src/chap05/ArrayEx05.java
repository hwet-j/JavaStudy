package chap05;

import java.util.Arrays;

public class ArrayEx05 {
	public static void main(String[] args) {
		// int형 숫자데이터를 저장하기 위한 배열 arr1 선언
		int[] arr1 = new int[] {11, 12, 13, 14, 15};
		
		// for문을 이용한 출력
		System.out.println("기본 for문 사용 출력");
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("배열의 %d번째 요소(arr1[%d]) 값 : %d\n", i+1, i, arr1[i]);
		}
		
		// 향상된for문을 이용한 출력
		System.out.println("");
		System.out.println("향상된  for문을 사용해 출력(배열자체가 for문의 변수)");
		for (int i:arr1) {
			System.out.printf("배열의 요소 값 : %d\n", i);
		}
		
		// Arrays 메소드를 사용하여 배열 출력
		System.out.println();
		System.out.println("Arrays.toSting() 사용하여 출력 (util)");
		System.out.println("배열 출력 : " + Arrays.toString(arr1));
		
		
	}

}
