package chap13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 순차적으로 데이터를 추가/삭제 - ArrayList가 빠르다
// 비순차적으로 데이터를 추가/삭제 - LinkedList가 빠르다
// 접근시간 - ArrayList가 빠르다
public class Linked_List {

	public static void main(String[] args) {
		// ListedList는 각 인덱스에 주소값(참조값)이 들어간다. - 데이터의 접근성이 나쁨 
		// 다른 것은 리터럴값을 넣어줬으면 리터럴이 들어간다. 
		List list = new LinkedList();	
		list.add("B");
		list.add("T");
		list.add("A");
		list.add("H");
		list.add("K");
		
		for (Object obj:list) {
			System.out.println(obj);
		}
		
		
	}

}
