package chap13;

import java.util.Vector;

// 컬렉션 프레임워크
/*
자료구조를 사용해서 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록
인터페이스와 구현클래스를 java.util 패키지에서 제공하는 것을 총칭한다.
	Franework(프레임워크) - 사용방법을 정해놓은 라이브러리를 말한다.
 
	Library(라이브러리) - 라이브러리는 단순 활용가능한 도구들의 집합

 
	프레임워크 Vs 라이브러리
		두 개의 차이점은 프고그램의 제어 흐름이 주도성이 어디에 있는가에 있다.
		프레임워크는 전체적인 흐름을 스스로 가지고 있어 그 프레임워크 내에서 코드를 작성해 넣으며 
		라이브러리는 사용자가 흐름을 작성하면서 라이브러리를 가져다가 사용하는 것으로 볼 수 있다.
		즉, 프레임워크는 그 틀안에 제어 흐름에 대한 주도성도 포함하고 있으며, 라이브러리는 가져다 쓰이는 존재로 
		호출되는 쪽에 주도성을 준다.
			
https://webclub.tistory.com/458

*/




public class ArrayVector_p556 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		
		System.out.println("for문을 이용한 배열의 value 출력");
		for (int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
			
		System.out.println("\n향상된 for문을 이용한 배열의 value 출력");
		for (int i:arr1) {
			System.out.println(i);
		}
		
		// 인터페이스 참조변수 = new 구현클래스();
		Vector vec = new Vector();		// Vector 객체 생성
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		// index의 입력없이 add 메서드의 사용은 순차적으로 입력해준다.
		
		System.out.println("for문을 이용한 List(Vector)의 value 출력");
		// for문 사용시 주의할점은 List형의 길이는 size()를 사용한다.
		for (int i=0;i<vec.size();i++) {
			System.out.println(vec.get(i));
		}
		
		System.out.println("\n향상된 for문을 이용한 List(Vector)의 value 출력");
		for (Object i:vec) {
			System.out.println(i);
		}
		
		System.out.println("\n리스트의 단순 출력");
		System.out.println(vec);
		
		// isEmpty()의 사용
		System.out.println("\n리스트의 isEmpty()의 사용");
		System.out.println(vec.isEmpty()); 		// false를 반환 , 비어있지 않다는 의미
		
		System.out.println("\n리스트의 수정(remove, add, set)");
		// 값의 수정 - set(index, value)
		vec.set(4, 70);		// 수정의 개념으로 배열과 동일하게 생각하면 편하다. 현재 존재하지 않는 인덱스는 설정 불가.
		System.out.println("4번 인덱스값 수정 : "+vec);
		// 값의 추가 - add(index, value)
		vec.add(5, 80);
		System.out.println("5번 인덱스값 추가 : "+vec);
		// 값이 존재하는가 확인 - contains()
		System.out.println("60을 포함하는 리스트인가? : " + vec.contains(60));
		System.out.println("80을 포함하는 리스트인가? : " + vec.contains(80));
		// 해당 인덱스의 요소 사용 후 삭제(리턴값이 존재) - remove(index)
		System.out.println("삭제될 인덱스의 value값은? : " + vec.remove(5));
		System.out.println("삭제 후(remove) : "+vec);
		
		// 요소전체 삭제(리턴값 없음)
		vec.clear();
		System.out.println("삭제 후(clear) : "+vec);
		
		
		
		
	}
}
