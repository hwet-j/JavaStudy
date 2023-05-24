package chap13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*

Entry는 Map인터페이스 내부에 선언된 중첩인터페이스이다.
Object타입의 Key, Object타입의 Value
객체추가 - map참조변수.put(Object key, Object value)
객체검색 - map참조변수.get(Object key)		

*/

public class HashMap_p570 {

	public static void main(String[] args) {
		Map map = new HashMap();
		// key는 꼭 String일 필요는 없지만 편의상 그게 좋다.
		map.put("하나", 134098);
		map.put("두울", 5112.15);
		map.put("세엣", "문자열");
		map.put("네엣", '9');
		map.put("다섯", true);
		map.put("하나", "key중복"); // 마지막 선언된 값으로 저장
		
		//int value1 = (Integer)map.get("하나");
		double value2 = (Double)map.get("두울");
		String value3 = (String)map.get("세엣");
		char value4 = (Character)map.get("네엣");
		boolean value5 = (Boolean)map.get("다섯");
		
		//System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		System.out.println("keySet()메서드를 사용하여 새로운 객체를 만들어 사용");
		Set keys = map.keySet();
		for(Object obj:keys) {
			System.out.print("key : " + obj);
			System.out.println("  | value : " + map.get(obj));
		}
		
		/*
		 * Set<String> keys2 = map.keySet(); for(Object obj:keys2) {
		 * System.out.print("key : " + obj); System.out.println("  | value : " +
		 * map.get(obj)); }
		 */
		
		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
		
		System.out.println("\nEntry 사용");
		Set<Map.Entry<String, Object>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
