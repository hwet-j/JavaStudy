package mystudy.programmers;


/*
오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을
지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로
주어질 때, todo_list에서 아직 마치지 못한 일들을 순서대로 담은
문자열 배열을 return 하는 solution 함수를 작성해 주세요.
*/

public class _33 {
	public static void main(String[] args) {
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		int cnt = 0;
		for (boolean b:finished){
			if (b == false){
				cnt++;
			}
		}
		String[] answer = new String[cnt];
		cnt = 0;
		for (int i=0;i< todo_list.length;i++){
			if (finished[i] == true){
				continue;
			} else {
				answer[cnt++] = todo_list[i];
			}
		}

	}
}


// false의 개수를 먼저 파악하여 배열의 길이를 지정하고
// false면 하나씩 추가하였다. -> 리스트나 다른 컬렉션프레임워크를 사용하면 편하지만 최대한 배열연습먼저하는중
