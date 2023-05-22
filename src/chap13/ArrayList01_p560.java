package chap13;

import java.util.ArrayList;

public class ArrayList01_p560 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		// value 추가
		list.add(10);
		list.add(20);
		list.add(30);
		// size 확인
		int size = list.size();
		// 지금 배열의 길이를 확인하기 위해 생성된 size변수사용 x
		System.out.println("size : " + list.size());  
		// 값 출력
		// 특정 index 값 출력 -> 포함되어있음 get()
		for (int i=0;i<size;i++) {
			System.out.println(list.get(i));
		}
		
		// 특정 index 값 수정, 추가
		list.set(2, 40);
		list.add(3, 10);
		System.out.println(list);
		// 특정 index 값 삭제
		list.remove(3);		// 리턴값이 존재
		
		System.out.println("향상된 for문을 사용해 출력");
		for (Object i:list) {
			System.out.println(i);
		}
		
		// 전체 삭제
		list.clear();
		System.out.println("모든 요소 삭제 후 개수(길이) : " + list.size());
		
		
		// 삭제 후 다른 데이터 실험
		System.out.println("\n서로 다른 타입의 입력");
		list.add(3);
		list.add(3.56);
		list.add("리스트는 타입이 달라도 된다.");
		list.add("데이터");
		list.add(true);
		System.out.println(list);
		
	}
}
