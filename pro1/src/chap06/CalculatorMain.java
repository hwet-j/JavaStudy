package chap06;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double a = 6.0;
		double b = 9.0;
		
		System.out.println("한변의 길이가 " + a + "인 정사각형의 넓이 = " + cal.areaRectangle(a));
		System.out.println("가로의 길이가 " + a + ", 세로의 길이가 " + b + "인 직사각형의 넓이 = " + cal.areaRectangle(a,b));

	}

}
