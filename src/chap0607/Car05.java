package chap0607;

//이 클래스는 Machine01_p310클래스를 상속받는 하위클래스이다
//[접근제한자] [제어자] class 클래스명 extends 부모클래스명{}
public class Car05 extends Machine01_p310 {
	//Machine01클래스로부터 field,method를 상속받았다
	//[접근제어자] [제어자] 타입 필드명[=초기값];
	int currentSpeed=0;		//현재스피드
	static int maxSpeed=300;//최대스피드
	
	
	//method:기능.동작(동사적형태)
	//[접근제어자] [제어자] 리턴유형 메서드명(매개변수리스트){}
	//속도높이다
	void speedUp(int speed){
		//currentSpeed=currentSpeed+speed;
		currentSpeed+=speed;
	}
	
	//속도낮추다
	void speedDown(int speed){
		//currentSpeed=currentSpeed-speed;
		currentSpeed-=speed;
	}
	
}
