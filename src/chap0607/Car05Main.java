package chap0607;

//이 클래스는 Car05의 실행클래스이다/ Tv01 실행클래스
public class Car05Main {

	public static void main(String[] args) {
		Car05 myCar = null;
		myCar = new Car05();
		System.out.println(myCar);
		System.out.println(myCar.brand);
		System.out.println(myCar.color);
		System.out.println(myCar.productionDay);
		System.out.println(myCar.power);
		System.out.println(myCar.currentSpeed);
		System.out.println(myCar.maxSpeed);
		
		myCar.powerOn();
		myCar.powerOff();
		myCar.speedUp(50);
		System.out.println(myCar.currentSpeed);
		
		
		System.out.println();
		System.out.println("======== TV ==========");
		Tv01 tv = new Tv01();
		System.out.println(tv.brand);
		System.out.println(tv.color);
		System.out.println(tv.productionDay);
		System.out.println(tv.power);
		System.out.println(tv.speed);
		System.out.println(tv.maxspeed);
		tv.powerOn();
		tv.volumeUp(5);
		tv.volumeDown(3);
		tv.volumeDown(3);
		tv.powerOff();
		
	}

}













