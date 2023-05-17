package chap06;

// p265 : method overloading
/*
 * 클래스 내에 같은 이름의 메서드를 여러 개 선언하는 것.
 * 단, 매개변수의 타입, 개수, 순서 중 하나가 달라야한다. 
 * */
public class Calculator {
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	// 정사각형의 넓이
	int areaRectangle(int width) {
		return width * width;
	}
	// 정사각형의 넓이
//	double areaRectangle(int width) {		==> 매개변수의 타입,순서가 달라야함.. 리턴타입은 의미없음
//		return width * width;
//	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}

}
