package chap0607;

//p341- Tire를 부품으로 가지는 클래스
public class Car07 {
	//필드
	int price; //가격 
	String company; //제조회사명-기아,현대
	Tire fL_Tire=new Tire("앞좌",6);
	Tire fR_Tire=new Tire("앞우",2);
	Tire bL_Tire=new Tire("뒤좌",3);
	Tire bR_Tire=new Tire("뒤우",4);
	
	//생성자
	//메서드
	int run(){
		System.out.println("자동차달려요-Car의 run()");
		if(fL_Tire.roll()==false){stop(); return 1;}
		if(fR_Tire.roll()==false){stop(); return 2;}
		if(bL_Tire.roll()==false){stop(); return 3;}
		if(bR_Tire.roll()==false){stop(); return 4;}		
		return 0; //No problem일때
	} 
	void stop(){
		System.out.println("자동차멈춥니다-Car의 stop()");
	}
	
}







