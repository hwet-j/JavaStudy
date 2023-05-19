package chap11;

// == 연산자는 참조값을 비교하는 연산자
// equals 연산자는 참조값으로 부터 생성된 인스턴스 값을 비교
public class String01_p489 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		System.out.println("객체(참조값) 비교");
		// 객체(참조값) 비교
		if (name1 == name2) {
			System.out.println("name1과 name2는 참조값(객체)이 동일하다.");
		} else {
			System.out.println("name1과 name2는 참조값(객체)이 동일하지않다.");
		}
		
		if (name1 == name3) {
			System.out.println("name1과 name3는 참조값(객체)이 동일하다.");
		} else {
			System.out.println("name1과 name3는 참조값(객체)이 동일하지않다.");
		}
		
		if (name3 == name4) {
			System.out.println("name3과 name4는 참조값(객체)이 동일하다.");
		} else {
			System.out.println("name3과 name4는 참조값(객체)이 동일하지않다.");
		}
		
		System.out.println("\n=====================");
		System.out.println("인스턴스값 비교");
		// 문자열비교
		if (name1.equals(name2)) {
			System.out.println("name1과 name2는 참조값에서 생성된 인스턴스 값이 동일하다.");
		} else {
			System.out.println("name1과 name2는 참조값에서 생성된 인스턴스 값이 동일하지 않다.");
		}
		
		if (name1.equals(name3)) {
			System.out.println("name1과 name3는 참조값에서 생성된 인스턴스 값이 동일하다.");
		} else {
			System.out.println("name1과 name3는 참조값에서 생성된 인스턴스 값이 동일하지 않다.");
		}
		
		if (name3.equals(name4)) {
			System.out.println("name3과 name4는 참조값에서 생성된 인스턴스 값이 동일하다.");
		} else {
			System.out.println("name3과 name4는 참조값에서 생성된 인스턴스 값이 동일하지 않다.");
		}
		
		
		System.out.println("\n=====================");
		System.out.println("문자열(참조변수)이외의 기본타입도 확인해보자");
		int num1 = 5;
		int num2 = 5;
		int num3 = new Integer(5);
		int num4 = new Integer(5);
		// 객체(참조값) 비교
		if (num1 == num2) {
			System.out.println("num1과 num2는 참조값(객체)이 동일하다.");
		} else {
			System.out.println("num1과 num2는 참조값(객체)이 동일하지않다.");
		}
		
		if (num1 == num2) {
			System.out.println("num1과 num3는 참조값(객체)이 동일하다.");
		} else {
			System.out.println("num1과 num3는 참조값(객체)이 동일하지않다.");
		}
		
		if (num3 == num4) {
			System.out.println("num3과 num4는 참조값(객체)이 동일하다.");
		} else {
			System.out.println("num3과 num4는 참조값(객체)이 동일하지않다.");
		}
		System.out.println("==> 모두 동일하다는 결과를 얻음");
		System.out.println("equals연산자를 굳이 확인하지 않아도 될듯하다.");
		
		
	}
}
