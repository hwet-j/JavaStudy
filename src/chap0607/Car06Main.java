package chap0607;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car06Main {

	public static void main(String[] args) {
		Car06_p232 car = new Car06_p232();	// 기본생성자 호출
		System.out.println(car.getCompany());
		System.out.println(car.getPrice());
		System.out.println(car.getGrade());
		System.out.println(car.getProductionDay());
		System.out.println(car.isHybrid());
		
		System.out.println();
		System.out.println("===== company");
		Car06_p232 car2 = new Car06_p232("좋은회사");	
		System.out.println(car2.getCompany());
//		System.out.println(car2.getPrice());
//		System.out.println(car2.getGrade());
//		System.out.println(car2.getProductionDay());
//		System.out.println(car2.isHybrid());
		
		System.out.println();
		System.out.println("===== price");
		Car06_p232 car3 = new Car06_p232(3000);	
		System.out.println(car3.getPrice());
		
		System.out.println();
		System.out.println("===== company, price");
		Car06_p232 car4 = new Car06_p232("매우좋은회사", 6000);	
		System.out.println(car4.getCompany());
		System.out.println(car4.getPrice());
		
		System.out.println();
		System.out.println("================");
		
		// Car06클래스의 임의데이터로 초기화된 객체생성하세요
		Car06_p232 car5 = new Car06_p232("아주좋은회사",
		7000,
		'A', 		
		true,
		new Date("2023/05/11/17:22:10"));	
		
		System.out.println(car5.getCompany());
		System.out.println(car5.getPrice());
		System.out.println(car5.getGrade());
		System.out.println(car5.isHybrid());
		System.out.println(car5.getProductionDay());
		
		System.out.println();
		System.out.println("==================");
		
		SimpleDateFormat sim = new SimpleDateFormat("2023/05/11/17:22:10");
		// 객체를 출력해주는 메서드를 작성해 활용
		Car06_p232 car6 = new Car06_p232("아주회사",
				7000,
				'A', 		
				true,
				new Date("2023/05/11/17:22:10"));
//		car5.printInfo();
		System.out.println(car5.toString());
		
		
	}

}
