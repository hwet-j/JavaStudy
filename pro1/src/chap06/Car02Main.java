package chap06;

import java.util.Arrays;
import java.util.*;

public class Car02Main {
	public static void main(String[] args) {
		Car02 car = new Car02();
//		System.out.println(car.color);	// 클래스에서 필드 선언시 접근제어자를 private로 설정했기 때문에 다른 클래스에서 color변수를 찾을수없다.
		System.out.println(car.brand);
		
		
		// private는 외부접근을 막아주는 것 
//		System.out.println(car.currntSpeed);
		car.speedUp();
		
		// ==> private로 설정된 currentSpeed를 Car02Main 클래스에서 호출이 불가능 하지만,
		//  speedUp 메소드내에 존재하는 currentSpeed가 호출되는 것에는 에러가 발생하지 않는다.
		// speedUp 메소드는 currentSpeed가 선언된 클래스 동일한 내부에서 선언된 메소드이기 때문에 가능
		
		// getter() 메서드를 사용해서 필드값 가져오기( 위와 동일한 개념으로 private값을 가져올 수 있다. )
		System.out.println();
		System.out.println("get 메서드를 사용해서 필드값 가져오기");
		System.out.println(car.getCurrentSpeed());
		System.out.println(car.getBrand());
		System.out.println(car.getColor());
		System.out.println(car.getFe());
		System.out.println(car.getMaxSpeed());
		System.out.println(car.getRpm());
		System.out.println(car.getUseAI());
		System.out.println(car.isUseNav());
		
		// setter() 메서드를 사용해 필드값 수정후 getter()메서드로 확인
		System.out.println();
		System.out.println("set 메서드를 사용해서 필드값 수정하기");
		System.out.println("수정 전 : " + car.getColor());
		car.setColor("yellow");
		System.out.println("수정 후 : " + car.getColor());
		
		System.out.println("수정 전 : " + car.getBrand());
		car.setBrand("현대");
		System.out.println("수정 후 : " + car.getBrand());
		
		System.out.println("수정 전 : " + car.getUseAI());
		car.setUseAI('N');
		System.out.println("수정 후 : " + car.getUseAI());
		
	}

}

