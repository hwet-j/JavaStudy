package chap0607;

// 초기값 설정이안된 변수를 호출하여 자동초기화 되어있는지 확인
public class TestMain_p228 {
	public static void main(String[] arg) {
		Test_p228 test = new Test_p228();

		System.out.println(test.b); // 0
		System.out.println(test.c); // 공백
		System.out.println(test.s); // 0
		System.out.println(test.price); // 0
		System.out.println(test.l); // 0
		System.out.println(test.f); // 0.0
		System.out.println(test.d); // 0.0
		System.out.println(test.bool); // false
		// ==> 초기값이 자동설정된 것을 확인

		System.out.println(test.color); // null
		System.out.println();

		Car01 car = new Car01();
		String carColor = car.color;
		double carFe = car.fe;
		System.out.printf("Car01클래스의 색상 = %s\n", carColor);
		System.out.printf("Car01클래스의 연비 = %f\n", carFe);


		
		
		
	}
}
