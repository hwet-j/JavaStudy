package chap0607;

import java.util.Calendar;
import java.util.Date;

/*Promotion(p333) :자동형변환. 
 * 상속관계에 있는 클래스간  
 * 프로그램 실행 도중에 자동적으로 타입변환이 일어나는 것.
 * 문법>  
 *  클래스      참조변수 = new 클래스();
 *  부모타입   참조변수 = 자식타입
 *  부모클래스 참조변수 = new 자식클래스(); 
 
 *자동형변환.자식은 부모 타입으로 자동타입변환이 가능
 //p335.자동타입변환된 이후에는 부모클래스에서 선언된 필드와 메서드만 접근가능
 *  */

class GrandFather02{
	int height=160;
	String name="홍할";
	void sing() {System.out.println("할아버지의 sing()");}
}
class Father02 extends GrandFather02{
	int height=170;
	String addr="서울";
	void dance() {System.out.println("아빠의 dance()");}
	void sing() {System.out.println("아빠의sing()");}
}
class son02    extends Father02{
	int height=180;
	String gender="남자";
	void run() {System.out.println("아들의 run()");}
}
public class Promotion02_p336 {
	public static void main(String[] args) {
		//자동형변환.자식은 부모 타입으로 자동타입변환이 가능
		//p335. 자동타입변환된 이후에는 부모클래스에서 선언된 필드와 메서드만 접근가능
		GrandFather02 gf1 = new GrandFather02();//110번지
		System.out.println("할아버타입참조변수gf1.height="+gf1.height);//160
		System.out.println("할아버타입참조변수gf1.name="+gf1.name);
		gf1.sing();
		 			
		GrandFather02 gf2 = new Father02();		//210번지
		System.out.println("할아버타입참조변수gf2.height="+gf2.height);//160
		System.out.println("할아버타입참조변수gf2.name="+gf2.name);
		gf2.sing();
		//System.out.println("할아버타입참조변수gf2.addr="+gf2.addr);
		//addr cannot be resolved or is not a field
		//gf2.dance();
		//The method dance() is undefined for the type GrandFather02
		
		GrandFather02 gf3 = new son02();		//310번지
		System.out.println("할아버타입참조변수gf3.height="+gf3.height);//160
		System.out.println("할아버타입참조변수gf3.name="+gf3.name);
		gf3.sing();
		//gf3.dance();//에러발생
		//gf3.run();//에러발생
		//gf3.addr="제주";//에러발생
		//gf3.gender="여성";//에러발생
						
	/*	
	 * GrandFather gf = new GrandFather(); //100번지
		Father      f  = new Father();	    //200번지
		son         son= new son();			//300번지
		
	 * 
		Father      f1 = new Father();		//220번지
					f1 = f;					//200번지
					f1 = new son();			//320번지
					f1 = son;				//300번지
		
		son         son1=new son();			//320번지
					son1=son;				//300번지
		*/			
	}
}



















