package chap06;

// p253 실습예제 - 매개변수의 개수를 모르는 경우 
public class Computer01Main_p253 {
	public static void main(String[] args) {
		Computer01_p253 com = new Computer01_p253();
		
		// Computer01 클래스에서 sum1은 매개변수가 배열로 선언되었기 때문에 호출시에도 배열로 선언하여 작성해줘야 한다. (주소값이 매개변수임) 
		System.out.println(com.sum1(new int[]{1,2,3,5,6,7}));
		// Computer01 클래스에서 배열이 아닌 ... 로 선언 하였기 때문에 호출시 배열로 입력하지 않아도 자동으로 배열로 수정되어 들어간다.(배열도 가능)
		System.out.println(com.sum2(1,2,3,5,6,7));
		System.out.println(com.sum2(new int[]{1,2,3,5,6,7}));
		
		
		
		
	}
}
