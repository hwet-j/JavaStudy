package chap13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain_p576 {

	public static void main(String[] args) {
		// Map인터페이스를 참조하는 HashMap 객체생성
		
		Map map1 = new HashMap();
		map1.put("홍길동", 100);
		map1.put("이순신", 95);
		map1.put("세종", 90);
		
		int score1 = (Integer)map1.get("홍길동");
		
		Set keys1 = map1.keySet();
		
		// Key 참조객체 Student
		Map<Student, Integer> map2 = new HashMap<Student, Integer>();
		
		map2.put(new Student(1, "홍길동", "남자", "신소재"), 94);
		map2.put(new Student(2, "이순신", "남자", "기계"), 91);
		map2.put(new Student(3, "세종", "남자", "국문"), 79);
		map2.put(new Student(4, "홍길순", "여자", "컴퓨터"), 89);
		map2.put(new Student(5, "홍길똥", "남자", "역사"), 89);
		map2.put(new Student(4, "홍길순", "여자", "디자인"), 14);
		
		System.out.println("학생의 수 : " +map2.size());
		
		Set <Student> keys2 = map2.keySet();
		Iterator<Student> iters2 = keys2.iterator();
		while(iters2.hasNext()) {
			Student key = iters2.next();
//			System.out.println("학생 " + key.getStuName() + "의 점수는 " + map2.get(key) + "점");
			System.out.println(key.toString() + map2.get(key));
			// ==> Key값은 초기 넣어준 값을 유지하지만, Value값은 나중값으로 덮어씌워진다.
			// 동등 객체의 기준이 학번이며 동일학번이 존재하면 Student에 정의된 메서드로 인해 
			// 새로 추가되지 않는다. 하지만, Value값은 Integer로 저런 메서드를 정의 하지 않았다.
			// 그러므로 나중에 입력된 데이터로 덮어씌워진다.
		}
		

	
	
	}

}
