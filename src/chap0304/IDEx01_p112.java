package chap0304;

/*증감연산자
	변수++
	++ 변수
	변수--
	--변수
	
 * */

public class IDEx01_p112 {

	public static void main(String[] args) {
		// 변수 x,y,z의 값을 출력
		int x = 10;
		int y = 20;
		int z;
		
		System.out.println("초기 x = " + x);
		System.out.println("초기 y = " + y);
		
		x++;
		System.out.println("x = " + x);	// x = 11
		x--;
		System.out.println("x = " + x);	// x = 10
		// 큰 의미를 찾아보기 힘들다
		
		System.out.println("x = " + x--);	 // x =10 이지만 최종적으로 저장된 x값은 9
		System.out.println("x = " + x);	 // x=9인것을 확인할 수 있다.
		// 수식이 끝나고 -연산이 들어가 출력이후 값이 감소한다.
		
		System.out.println("x = " + ++x);	  // x= 10
		System.out.println("x = " + x);	 	// x = 10
		
		z = x++;
		System.out.println("z = " + z);   // z = 10 
		System.out.println("x = " + x);   // x = 11 
		// ==> z=x++;에서 z라는 변수에 x(10)가 적용된후에 ++연산을 작업하여 
		// z = 10 이 되고, x = 11 이된다. 
		
		z = ++x;
		System.out.println("z = " + z);   // z = 12 
		System.out.println("x = " + x);   // x = 12 
		
		// y = 20
		y--;
		System.out.println("y = " + y);  // y = 19
		--y;
		System.out.println("y = " + y);  // y = 18
		
		// x = 12, y = 18
		z = ++x + y++; 	//  13 + 18  ==> 수식 끝난 이후 y는 19가
		System.out.println("z = " + z);		// z = 31
		
		
		
		
	}

}
