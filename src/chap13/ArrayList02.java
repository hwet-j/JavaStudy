package chap13;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		long st = System.nanoTime();
		// ArrayList클래스의 객체를 List인터페이스 타입 변수에 할당
		// --> 왜why? 인터페이스는 스스로 객체화가 불가능하기 때문이다.(물론 다른이유도 있을것)
		List list = new ArrayList();	// Object타입의 변수를 요소로 갖는다.
		list.add("B");
		list.add("T");
		list.add("A");
		list.add("H");
		list.add("K");
		
		for (Object obj:list) {
			System.out.println(obj);
		}
		
		for (int i=0;i<500000;i++) {
			list.add(";lkjasdflakjsdf;asjdfl;kasjdfljwjwjwjfjwjwj");
		}
		
		System.out.println("프로그램 시간 체크해보기");
		long et = System.nanoTime();
		long runtime = et - st;
		
		System.out.println(runtime);
		
		List<String> list2 = new ArrayList();
		list2.add("String타입을 저장할 List임");
		// list2.add(4); 	// 에러남
		
	}

}
