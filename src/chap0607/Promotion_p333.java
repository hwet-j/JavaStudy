package chap0607;

import java.util.Calendar;
import java.util.Date;

/*Promotion(p333) :자동형변환. 
 * 상속관계에 있는 클래스간  
 * 프로그램 실행 도중에 자동적으로 타입변환이 일어나는 것.
 * 문법>  
 *  클래스      참조변수 = new 클래스();
 *  부모타입   참조변수 = 자식타입
 *  부모클래스 참조변수 = new 자식클래스(); */
class Table extends Object{}
class GrandFather extends Object{}
class Father extends GrandFather{}
class son 	 extends Father{}

public class Promotion_p333 {

	public static void main(String[] args) {	
		GrandFather gf = new GrandFather(); //100번지
		Father      f  = new Father();	    //200번지
		son         son= new son();			//300번지
		
		Object      obj= new Table();
					obj= new GrandFather();
					obj= new Father();
					obj= new son();
					obj= new Date();
					obj= Calendar.getInstance();
					obj= new String("홍길동");
					obj= "홍길동";
		Table       table=new Table();	
		
		//p333 클래스의 변환은 상속관계에 있는 클래스 사이에서 발생한다
		//Table     table1=new GrandFather();//에러발생
		//Type mismatch: cannot convert from GrandFather to Table
		//Table     table2=new Father();////에러발생
		//Type mismatch: cannot convert from Father to Table
		//Table     table3=new son();	 ////에러발생
		//Type mismatch: cannot convert from son to Table
		
		//자동형변환.자식은 부모 타입으로 자동타입변환이 가능
		GrandFather gf1 = new GrandFather();//110번지
		 			gf1 = gf;				//100번지
					gf1 = new Father();		//210번지
					gf1 = f;				//200번지 
					gf1 = new son();		//310번지
					gf1 = son;				//300번지	
		
		Father      f1 = new Father();		//220번지
					f1 = f;					//200번지
					f1 = new son();			//320번지
					f1 = son;				//300번지
		
		son         son1=new son();			//320번지
					son1=son;				//300번지
					
	}
}


















