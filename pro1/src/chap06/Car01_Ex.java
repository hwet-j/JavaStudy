package chap06;

// Car01의 실행 클래스
public class Car01_Ex {

	public static void main(String[] args) {
		Car01 car = new Car01();
//		System.out.println(car);
//		System.out.println(car.brand);
//		System.out.println(car.color);
//		System.out.println(car.currentSpeed);
//		System.out.println(car.fe);
//		System.out.println(car.maxSpeed);
//		System.out.println(car.rpm);
//		System.out.println(car.useAI);
//		System.out.println(car.useNav);
		
		
		System.out.println("차량 색 : " + car.color);
		car.color = "blue";		// 실행 이후 결과는 다시 red
		System.out.println("차량 색 : " + car.color);
		
		System.out.println("연비 : " + car.fe);
		car.fe = 12.9;		
		System.out.println("연비 : " + car.fe);
		
		car.powerOn();
		System.out.println(car.currentSpeed);
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		System.out.println(car.currentSpeed);
		car.speedUp();
		car.speedUp();
		car.speedDown();
		System.out.println(car.currentSpeed);
		
		car.powerOff();
		
		
	}

}
