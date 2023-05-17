package chap0607;

public class Car04Main {
	public static void main(String[] args) {
		Car04_p277 car01 = new Car04_p277();
		car01.color = "red";
		System.out.println(car01.color);
		car01.powerOnOff();
		System.out.println();
		
		Car04_p277 car02 = new Car04_p277();
		car02.color = "black";
		System.out.println(car02.color);
		car02.powerOnOff();
		System.out.println();
		
		System.out.println(Car04_p277.maxspeed);		// 정적 변수 호출
		Car04_p277.powerOnOff();
		car02.powerOnOff();			// 참조변수명을 통해서도 static멤버 호출 가능 (하지만 static의 선언의 이유가 약해짐.)
	}

}
