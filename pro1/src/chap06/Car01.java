package chap06;

// 클래스 
/* [접근제어자] [제어자] class 클래스명{		==> 대문자로 시작
 	필드(filed) : data(명사적 형태)
 	[접근제어자] [제어자] 타입 필드명 [=초기값];
 	
 	생성자(constructor) : 객체 생성, 필드초기화 주로 사용		==> 소문자로 시작
 	[접근제어자] 클래스명([매개변수리스트]){~}
 
  
  	메서드(method) : 기능, 동작(동사적 형태)
  	[접근제어자] [제어자] 리턴타입 메서드명([매개변수리스트]){~}
  }
 */
public class Car01 {
	String color="red";		// 색상- "red"
	String brand = "볼보";		// 브랜드-"볼보" "테슬라"
	double fe; //연비-10.5   
	int rpm;//RPM - 0~100000
	char useAI = 'Y';// AI탑재유무-'Y' 'N'   -> char 형이기 때문에 대소문자 구분해야함.
	boolean useNav = true;//네비게이션유무- true false 
	
	int currentSpeed = 0;
	int maxSpeed = 300;
}
