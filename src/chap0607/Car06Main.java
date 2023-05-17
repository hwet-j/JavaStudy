package chap0607;

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
	}

}
