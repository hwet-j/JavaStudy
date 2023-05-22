package mystudy.programmers;


/*
최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의
이름이 담긴 문자열 리스트 names가 주어질 때, 앞에서 부터 5명씩
묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를
return하도록 solution 함수를 완성해주세요. 마지막 그룹이
5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
*/

public class _32 {
	public static void main(String[] args) {
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

		String[] answer = new String[(names.length-1) / 5 + 1];

		int cnt = 0;

		for (int i=0; i< names.length; i=i+5){
			answer[cnt++] = names[i];
		}

	}
}


// 가장 첫 index가 추가되고 5개단위로 한명씩 추가되므로 길이설정에 주의해야함
