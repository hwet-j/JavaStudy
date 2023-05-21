package programmers;

/*
문자열 my_string과 두 정수 m, c가 주어집니다. 
my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 
세로로 c번째 열에 적힌 글자들을 문자열로 
return 하는 solution 함수를 작성해 주세요.
*/
public class _14 {

	public static void main(String[] args) {
		String my_string = "ihrhbakrfpndopljhygc"; 
		int m = 4;
		int c = 2;
		String answer = "";
		String[] strArr = my_string.split("");
		String[][] multiArr = new String[strArr.length/m][m];
		
		for (int i=0;i<strArr.length/m;i++) {
			for (int j=0; j<m; j++) {
				multiArr[i][j] = strArr[(i*m) + j];
			}
		}
		for (int i=0;i<strArr.length/m;i++) {
			answer += multiArr[i][c-1];
		}
		System.out.println(answer);
		
	}

}
