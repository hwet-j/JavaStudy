package chap0304;

/* do while 문
 do{
 반복실행코드
 } while (조건);
 
 ==>  while문 이 뒤에있어 실행문이 최초1회 실행되고 while문의 조건문을 만난다.
 ==> 고로 최소한 반복실행코드를 한번 실행한다.
 
 */
public class WhilEx02_p155 {

	public static void main(String[] args) {
		// 1부터 5까지의 합을 구하시오(while문 이용)
		int num = 0;
		int sum = 0;
		while(num < 5){
			sum += ++num;
		}
		System.out.println("총합 = " + sum);
		
		// do-while문
		int k=1020;
		do {			// ==> while문의 조건 k<6을 만족하지 않음에도 최초1회 싫행된다.
			System.out.println(k); k++;
		} while(k < 6);
		
	}

}
