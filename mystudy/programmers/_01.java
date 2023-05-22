package programmers;


// 배열의 평균
public class _01 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		double answer = 0;
		for (int i =0; i < arr.length; i++) {
			answer += arr[i];
			System.out.println(arr[i]);
		}
		answer /= arr.length;
		
		System.out.println(answer);
	}
}
