package chap13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet-Set 인터페이스의 구현클래스
// List : 순서가 있다. 중복이 가능하다.
// Set : 순서가 없다. 중복이 되지않는다.
public class HashSet01_p567 {
	public static void main(String[] args) {
		Set set1 = new HashSet();
		set1.add("B");
		set1.add("T");
		set1.add("A");
		set1.add("H");
		set1.add("K");
		set1.add("B");
		
		for (Object obj:set1) {
			System.out.println(obj);	
		}
		// B를 두 번 넣어줬지만, 하나만 출력되는것으로 보아 중복이 불가능하다는 것을 확인할 수 있고,
		// B,T,A,H,K 순으로 넣어줬지만 A,B,T,H,K로 출력되는 것을보아 넣어준 순서대로 출력되지 않는것을 확인할 수 있다.
		
		System.out.println("set1의 크기 : "+ set1.size());
		
		// 특정 객체 "KIA" 삭제
		set1.add("KIA");	// 테스트를 위해 KIA 요소 추가
		System.out.println(set1);
		set1.remove("KIA");
		System.out.println(set1);
		// 특정문자 포함여부 확인
		System.out.println("KIA 포함 여부 : "+ set1.contains("KIA"));
		System.out.println("K 포함 여부 : "+ set1.contains("K"));
		
		// Iterator 인터페이스 활용
		System.out.println("\nIterator 인터페이스를 사용해 조건문 설정");
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());	// 순서 유지 X
		}
		
		
	}
}
