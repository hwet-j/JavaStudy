package chap0304;

import java.util.Random;

/* 조건문 - switch
 * switch (변수) {
 * case 값1: 실행코드 ; [break;]
 * case 값2: 실행코드 ; [break;]
 * case 값3: 실행코드 ; [break;]
 * case 값4: 실행코드 ; [break;]
 * case 값5: 실행코드 ; [break;]
 * .....................
 * case 값N: 실행코드 ; [break;]
 * default:실행코드;  ==> 마지막이라 break문 필요 없음
 * 
 * 
 * == > 변수가 값에 해당하는 조건을 만족할때 그 위치에서 실행코드가 실행되며
 * break문이 없다면 조건을 만족한 이후의 코드를 지속적으로 실행한다. 
 * 그렇기 때문에 특정한 상황이 아니라면 break문을 작성해줘야 해당 값의 코드만 실행된다.
 * default까지 전부 출력됨 (break문이 없다는 가정하에)
*/

public class SwitchEx01_p141 {
	public static void main (String[] args) {
		Random rand = new Random();
		int score = rand.nextInt(7) + 1;
		switch(score) {
		case 1: System.out.println("score의 값은 " + score); break;
		case 2: System.out.println("score의 값은 " + score);break;
		case 3: System.out.println("score의 값은 " + score); break;
		case 4: System.out.println("score의 값은 " + score); break;
		case 5: System.out.println("score의 값은 " + score); 
		case 6: System.out.println("score의 값은 " + score);
		default:System.out.println("?????");
		}
		
		
		String id = "hongid"; 
		switch(id) {
		case "hongid": System.out.println("회원 id는 " + id); break;
		case "kimid": System.out.println("회원 id는 " + id);break;
		case "choiid": System.out.println("회원 id는 " + id); break;
		default:System.out.println("회원정보가 없습니다.");
		}
		// ==> switch문은 int,char이외에 String도 가능하다.(단, 값과 변수의 타입을 맞춰줄것.)
		
		// 위의 switch문의 특성을 이용하여 위에서부터 완벽히 동일한 코드를 실행하는 경우 
		// 동일한코드의 마지막만 남겨놓고 코드를 작성할 수있다. (코드의 양을 줄일수 있다.)
		switch(id) {
		case "hongid": 
		case "kimid":
		case "choiid": System.out.println("회원 id는 " + id); break;
		default:System.out.println("회원정보가 없습니다.");
		}
		
		
		
	}
}
