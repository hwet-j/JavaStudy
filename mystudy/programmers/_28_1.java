package programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다.
str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는
문자열들을 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에
있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
"l"이나 "r"이 없다면 빈 리스트를 return합니다.

*/
public class _28_1 {
	public static void main(String[] args) {
		String[] str_list = {"u", "u", "l", "r"};
		List<String> list = new ArrayList<>();
		String temp = "";
		for(int i=0; i<str_list.length; i++){
			temp += str_list[i];
		}
		if(temp.contains("l") || temp.contains("r")){
			for(int i=0; i<str_list.length; i++) {
				if(str_list[i].equals("l")) {
					for(int j=0; j<i; j++) {
						list.add(str_list[j]);
					}
					break;
				}else if(str_list[i].equals("r")) {
					for(int j=i+1; j<str_list.length; j++) {
						list.add(str_list[j]);
					}
					break;
				}
			}
		}

		String[] answer = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(answer));
	}
}


// 리스트에 l,r이 포함되는지 l이먼저 나오는지, r이 먼저나오는지 확인하여 조건에 맞게 입력해야한다.
// 우선 temp 라는 String타입의 문자열을 생성하여 한글자씩 넣어 주는 작업을 진행한다.
// temp에 contains 메서드를 사용하여 문자열 내에 l, r이 존재하는지 1차 확인한다.
// l, r이 존재하지 않으면 아무작업을 진행하지 않고 빈 List를 배열화 작업한다.
// 만약 존재한다면 for문을 통해 순차적으로 문자를 확인하며 l이 나왔을 경우 앞에서부터 l이 나온 index전까지
// r이 먼저 나왔을 경우에는 r이 나온 다음 index부터 마지막 index까지 List에 추가하는 작업을 진행한다.