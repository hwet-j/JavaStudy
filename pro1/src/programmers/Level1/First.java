package programmers.Level1;

import java.util.*;
import java.util.Map.Entry;

/* 달리기 경주
 문제 설명
얀에서는 매년 달리기 경주가 열립니다. 해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다. 
예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 해설진이 "soe"선수를 불렀다면 2등인 
"soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다. 즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.

선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 해설진이 부른 이름을 담은 문자열 배열 
callings가 매개변수로 주어질 때, 경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해주세요.

제한사항
5 ≤ players의 길이 ≤ 50,000
players[i]는 i번째 선수의 이름을 의미합니다.
players의 원소들은 알파벳 소문자로만 이루어져 있습니다.
players에는 중복된 값이 들어가 있지 않습니다.
3 ≤ players[i]의 길이 ≤ 10
2 ≤ callings의 길이 ≤ 1,000,000
callings는 players의 원소들로만 이루어져 있습니다.
경주 진행중 1등인 선수의 이름은 불리지 않습니다.


입출력 예
players= ["mumu", "soe", "poe", "kai", "mine"]	
callings = ["kai", "kai", "mine", "mine"]	
result = ["mumu", "kai", "mine", "soe", "poe"]
*/


public class First {

	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"}; 
		String[] callings = {"kai", "kai", "mine", "mine"};
		String temp = "";
		int rating = 0;
		//indexOf를 사용하게 되면 코드가 무거워 진다는 말이 있으며, 실제로 프로그래머스에 제출하면 시간 초과문제로 통과불가.
		/* 
		for (int i = 0; i< callings.length;i++) {
			rating = Arrays.asList(players).indexOf(callings[i]);		
			temp = players[rating-1];
			players[rating-1] = players[rating];
			players[rating] = temp;
		}
		System.out.println(Arrays.toString(players));
		*/
		
		
		Map<String, Integer> map = new HashMap();
		for (int i=0; i<players.length;i++) {
			map.put(players[i],i);
		}
		System.out.println(map);
		for (int i=0; i<callings.length;i++) {
			rating = map.get(callings[i]);
			
			for(Map.Entry<String, Integer> entry : map.entrySet()){
			    if(entry.getValue().equals(rating-1) ){
			      temp = entry.getKey();
			    }
			  }
			map.replace(callings[i], rating-1);
			map.replace(temp, rating);
		}
		
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());

		// 비교함수 Comparator를 사용하여 내림 차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
			{
				// 오름 차순 정렬
				return obj1.getValue().compareTo(obj2.getValue());
//				// 내림 차순으로 정렬
//				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		String[] result;
		System.out.println("내림 차순 정렬");
		// 결과 출력
		for(Entry<String, Integer> entry : list_entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}

// Arrays.asList().indexOf() 는 특정문자가 들어간 index를 찾는다. 
// 자바 배열에서는 indexOf()를 지원하지 않고 ArrayList자료구조에서만 지원하므로 asList()를 통해 변환시켜 인덱스를 구해야 한다. 

