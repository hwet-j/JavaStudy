package programmers;


import java.util.Arrays;


/*
문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는
문자열들을 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에
있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
"l"이나 "r"이 없다면 빈 리스트를 return합니다.

*/

// 첫번째 풀이 -> 여러개 실패 ( 원인, l과 r을 포함하지 않는 경우를 고려하지 않음 )
// 28_1 파일 정답파일
public class _28 {
	public static void main(String[] args) {
		String[] str_list = {"u", "u", "l", "r"};
		String[] answer = new String[str_list.length];


		for (int i=0;i<str_list.length; i++){
			if (str_list[i] == "l"){
				for (int j=0;j<i;j++){
					answer[j] = str_list[j];
				}
				answer = Arrays.copyOf(answer, i);
				break;
			} else if (str_list[i] == "r") {
				for (int j=i;j<str_list.length;j++){
					answer[j-i] = str_list[j];
				}
				answer = Arrays.copyOf(answer, str_list.length - i);
				break;
			}
		}

		if (answer.length == str_list.length){
			answer = new String[]{};
		}

		System.out.println(Arrays.toString(answer));
	}
}


