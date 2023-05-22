package programmers;

/*
 * 문제 설명
1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.

네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 * */
import java.util.Arrays;

public class _05 {

	public static void main(String[] args) {
		int answer = 0;
//        int[] intArr = new int[] {2,2,2,2};
        int[] intArr = new int[] {4,1,4,4};
//        int[] intArr = new int[] {6,3,3,6};
        
        Arrays.sort(intArr);
		
		int first = intArr[0];
		int second = intArr[1];
		int third = intArr[2];
		int fourth = intArr[3];
		
		System.out.println(Arrays.toString(intArr));
		if (first == second) {
			if(second == third && third == fourth) {		// 4
				answer = 1111 * first;
			} else if (second == third && third != fourth) {	// 3 1
				answer = (10 * first + fourth) * (10 * first + fourth);
			} else if (second != third && third == fourth) { // 2 2
				answer = (first + third) * (third - first);
			} else {	// 2 1 1
				answer = third * fourth;
			}
		} else {
			if(second == third && third == fourth) { // 1 3
				answer = (10 * fourth + first) * (10 * fourth + first);
			} else if (second == third && third != fourth) {	// 1 2 1
				answer = first * fourth;
			} else if (second != third && third == fourth) { // 1 1 2
				answer = first * second;
			} else {	// 1 1 1 1
				answer = first;
			}
		}
		System.out.println(answer);
	}
}
