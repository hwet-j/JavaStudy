package chap0607;

import java.util.Date;

//부모클래스=상위클래스=super클래스
//자식클래스=하위클래스=sub클래스=파생클래스
public class Machine01_p310 {
	//field :data(명사적형태)
	//[접근제어자] [제어자] 타입 필드명[=초기값];
	String brand;//브랜드  null "삼성" 
	String color;//색상 "red"
	Date productionDay;//생산일 null  2023/01/01  2023-01-01 2023.01.01  20230101 
	boolean power=false;//전원   false  
	
	//constructor(생성자):객체생성.필드초기화 주로 사용
	//[접근제어자] 클래스명(매개변수리스트){}
	
	//method:기능.동작(동사적형태)
	//[접근제어자] [제어자] 리턴유형 메서드명(매개변수리스트){} 
	//전원키다
	void powerOn(){
		System.out.println("powerOn()호출");
		power = true;  //!power  !false
	}
	
	//전원끄다
	void powerOff(){
		System.out.println("powerOff()호출");
		power = false;
	}
}











