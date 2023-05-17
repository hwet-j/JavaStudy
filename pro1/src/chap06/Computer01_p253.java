package chap06;

// p253 실습예제 - 매개변수의 개수를 모르는 경우 
public class Computer01_p253 {
	int sum1(int[] values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
