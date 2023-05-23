package chap13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// List 인터페이스를 참조하는 ArrayList 클래스 객체 생성
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(10L);
		list1.add(3.1);
		list1.add(Math.random());
		list1.add('a');
		list1.add(true);
		list1.add("문자열");
		list1.add(10L);	// 중복테스트
		// ==> Object Type(전부) , 선언 시 특정 타입을 명시하지 않았기 때문에 Object 
		for(Object obj:list1) {
			System.out.println(obj);
		}
		
		// Set 인터페이스를 참조하는 HashSet 클래스 객체 생성
		System.out.println("\nsSet출력");
		Set set1 = new HashSet();
		set1.add(1);
		set1.add(10L);
		set1.add(3.1);
		set1.add(Math.random());
		set1.add('a');
		set1.add('1');
		set1.add(true);
		set1.add("문자열");
		set1.add(10L);	// 중복테스트
		
		// Iterator 인터페이스를 사용해 출력
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		// next()는 사용 시 마다 위치를 기억한다. 
		// hasNext()는 next()의 위치에 따라 값이 결정된다. hasNext()는 연속해서 여러번 사용해서 값이 변하지 않는다.
		
		// 배열과 다르게 여러개의 타입을 요소로 갖는 List, Set..
		// Object객체로 생성된 리스트,Set 타입에서 특정 타입만 뽑아 오는 방법 
		System.out.println("\n특정 타입만 출력");
		Iterator iter2 = set1.iterator();
		while(iter2.hasNext()) {
			Object obj = iter2.next();
			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str);
			}
		}
		// 특정한 타입의 객체(인스턴스)만 사용하고싶은 경우에 사용하며 상황에 따라 사용한다.
		//  List, Set에 타입을 지정하여 사전에 문제를 방지할 수 있다.
		
	}

}
