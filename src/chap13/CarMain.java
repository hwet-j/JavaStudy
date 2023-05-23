package chap13;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CarMain {

	public static void main(String[] args) {
		// Car라는 배열을 선언
		CarDTO[] carArr;
		CarDTO[] carArr2 = new CarDTO[] {new CarDTO()};
		CarDTO[] carArr3 = new CarDTO[3];
		
		String[] brandArr = {"기아", "현대", "쌍용"};
		String[] modelArr = {"더뉴레이", "제네시스", "티볼리"};
		int[] disArr = {10000, 30000, 34000};
		double[] feArr = {12.7, 11.3, 14.2};
		Date[] pdArr = {new Date(121,9,1), new Date(111,4,7), new Date(120,3,16)};
		boolean[] isnArr  = {true, true, true};
		
		
		
		CarDTO car1 = new CarDTO("기아", "더뉴레이", 10000, 12.7, new Date(121,9,1),true);
		CarDTO car2 = new CarDTO("현대", "제네시스", 30000, 11.3, new Date(111,4,7),true);
		CarDTO car3 = new CarDTO("쌍용", "티볼리", 34000, 14.2, new Date(120,3,16),true);
		CarDTO[] carArr4 = new CarDTO[] {car1, car2, car3};

		
		for (CarDTO item:carArr4) {
			System.out.println("브랜드명 : " + item.getBrand());
			System.out.println("모델명 : " + item.getModelName());
			System.out.println("이동거리 : " + item.getDistance());
			System.out.println("연비 : " + item.getFuelE());
			System.out.println("생산일자 : " + item.getProductDate());
			System.out.println("네비유무 : " + item.isNavi());
			System.out.println();
		}
		// toSting메서드 오버라이딩하여 멤버변수 출력
		System.out.println("-------------------");
		for (CarDTO item:carArr4) {
			System.out.println(item.toString());
		}
		
		
		CarDTO car4 = new CarDTO("리스트1", "더뉴레이", 10000, 12.7, new Date(121,9,1),true);
		CarDTO car5 = new CarDTO("리스트2", "제네시스", 30000, 11.3, new Date(111,4,7),true);
		CarDTO car6 = new CarDTO("리스트3", "티볼리", 34000, 14.2, new Date(120,3,16),true);
		
		// carList라는 리스트 선언 . ( 값저장 , 출력 )
		System.out.println("\n-------- CarDTO 타입의 List ---------");
		// CarDTO 타입의 List를 메모리에 할당 -> 타입 지정하는 것을 Generic이라 한다.
		List<CarDTO> carList = new ArrayList<CarDTO>();
		
		// 할당된 메모리에 데이터 추가
		carList.add(car4);
		carList.add(car5);
		carList.add(car6);
		
		// 출력
		// for (데이터타입 요소를저장할변수명:for문에사용되는객체의요소)
		for (CarDTO item:carList) {
			System.out.println(item.toString());
		}
		
		// Object 타입으로 만들어 출력해보기
		List carList2 = new ArrayList();
		// Object 타입으로 자동 형변환 되었기 때문에 부모클래스인 Object에만 존재하는 메서드만 사용가능하다.
		// 그렇기 때문에 값을 출력하고 싶다면 강제 형변환 하여 출력해야 한다. 
		for (Object item:carList2) {
			System.out.println(((CarDTO)item).getBrand());
		}
		
		
		System.out.println("\n====== Set ========");
		Set<CarDTO> set1 = new HashSet<CarDTO>();
		set1.add(car2);
		set1.add(car4);
		set1.add(car6);
		set1.add(car2);		// 중복 테스트
		
		for (CarDTO setItem:set1) {
			System.out.println(setItem.toString());
		}
		
		// Iterator 사용
		System.out.println("\n -----------Iterator 사용 ------------");
		Iterator<CarDTO> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next().getModelName());
		}
		
		
		System.out.println("\n----- Object 타입 ------");
		Set set2 = new HashSet();
		set2.add(car2);
		set2.add(car4);
		set2.add(car6);
		set2.add(car2);		// 중복 테스트
		
		for (Object setItem:set2) {
			System.out.println(setItem.toString());	// 오버라이딩된 값 출력
			System.out.println(((CarDTO)setItem).getBrand());	// CarDTO에만 있는 메서드 사용하려면 강제형변환 필요
		}
		
		
	}

}


