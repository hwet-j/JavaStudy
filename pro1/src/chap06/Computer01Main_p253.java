package chap06;

// p253 실습예제 - 매개변수의 개수를 모르는 경우 
public class Computer01Main_p253 {
	public static void main(String[] args) {
		Computer01_p253 com = new Computer01_p253();
		
		System.out.println(com.sum1(new int[]{1,2,3,5,6,7}));
		System.out.println(com.sum2(1,2,3,5,6,7));
	}
}
