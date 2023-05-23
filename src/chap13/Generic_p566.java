package chap13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Generic_p566 {

	public static void main(String[] args) {
		// String타입의 객체만 가질 수 있다.
		List<String> list1 = new ArrayList<String>();
		list1.add("문자열만");
		list1.add("입력이");
		list1.add("가능하다");
		
		System.out.println(list1);
		for (String str:list1) {
			System.out.println(str);
		}
		
		// Integer(int) 타입의 객체만 가질 수 있다.
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(11);
		list2.add(1515);
		list2.add(5099);
		
		System.out.println(list2);
		
		System.out.println("\nSet");
		
		
		Set<String> set1 = new HashSet<String>();
		set1.add("문자열만");
		set1.add("입력이");
		set1.add("가능하다");
		
		// Object타입은 String을 포함하고있으므로 가능(자동형변환)
		for (Object ss:set1) {
			System.out.println(ss);
		}
		
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}

}
