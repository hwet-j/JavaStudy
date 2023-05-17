package other;

import java.util.Date;

/* 
promotion : 상속관계에 있는 클래스간에 프로그램 실행 도중 자동 형변환이 일어나는 것
문법 > 
 	클래스 참조변수 = new 클래스();
 	부모클래스 참조변수 = new 자식클래스();
 */

class Table extends Object{}

class Father extends GrandFather{
	public String father;
	
	void fatherPrint() {
		System.out.println("Father가 출력됨");
	}
	
	public String getFather() {
		return father;
	}
	
	public void setFather(String father) {
		this.father = father;
	}
	
	
}

class GrandFather{
	public String grandFather;
	
	public GrandFather() {		
	}
	void grandFaPrint() {
		System.out.println("GrandFather가 출력됨");
	}
	
	public String getGrandFather() {
		return grandFather;
	}
	
	public void setGrandFather(String grandFather) {
		this.grandFather = grandFather;
	}
	
	
}

public class MyPromotion_p333 extends Father{
	public MyPromotion_p333() {
	}
	void childPrint() {
		System.out.println("자식 출력됨");
	}
	
	public static void main(String[] args) {
		System.out.println("===== test1 =====");
		GrandFather test1 = new Father();
		test1.grandFaPrint();
		// test1.fatherPrint();   
		// 참조변수는 Father()를 참조하지만 참조타입이 GrandFather이므로 자동 형변환되어
		// Father에 있는 메서드 사용 불가
		
		System.out.println("\n\n===== test2 =====");
		Father test2 = new Father();
		test2.grandFaPrint();
		test2.fatherPrint(); 		// 참조 타입이 Father이므로 Father의 메서드 사용가능
		
		System.out.println("\n\n===== test3 =====");
		GrandFather test3 = new MyPromotion_p333();
		test3.grandFaPrint();
		// test3.fatherPrint();
		// test3.childPrint();
		// test1의 결과와 동일하게 참조변수가 GrandFather이므로 Father, Child 메서드 사용불가
		
		System.out.println("\n\n===== test4 =====");
		Father test4 = new MyPromotion_p333();
		test4.grandFaPrint();
		test4.fatherPrint();
		// test4.childPrint();
		
		
		GrandFather gf = new GrandFather();			// a번지
		Father f = new Father();					// b번지
		MyPromotion_p333 son = new MyPromotion_p333();	// c번지
		
		GrandFather gf1 = new GrandFather();		// d번지
					gf1 = gf;						// a번지
					gf1 = new Father();				// e번지
					gf1 = f;						// b번지
					gf1 = new MyPromotion_p333();		// f번지
					gf1 = son;						// c번지
		// ==> 동일한 번지를 참조하는 상황에서는 새로운 번지가 아니므로 이전에 동일번지의 객체를 수정했다면, 수정된 상태가 유지된 채로 참조한다.
		// Table tab1 = new GrandFather();			// 불가
		// Table tab2 = new Father();				// 불가
		// Table tab3 = new Promotion_p333();		// 불가
		Object tab4 = new Object();
		Object tab5 = new Table();			// 위에서 명시적으로 Object를 상속시켰지만 모든 참조타입은 Object를 상속받고 있다.
		Object tab6 = new GrandFather();	// 명시적으로 Object를 상속받지 않았지만 선언가능하다.
		Object tab7 = new Father();			// '위와 같은 이유'
		Object tab8 = new MyPromotion_p333();	// '위와 같은 이유'
		Object tab9 = new Date();			// '위와 같은 이유'
		Object tab11 = new String("문자열");	// '위와 같은 이유'
		// 기본타입이 아닌 참조 타입중 new 키워드를 사용해서 생성하지 않아도되는 유일한 참조타입은 String이다.
		// 사용이 많이 되기 때문에 ""형식으로 작성하면 자동으로 문자열 타입으로 생성된다.
		Object tab10 = "문자열";	// '위와 같은 이유'
		// 기본타입은 정수형은 int, 실수형은 double.....의 형식으로 자동 입력된다.
		Object tab12 = 1245;				// '위와 같은 이유'
		Object tab15 = new Integer(1245);	// int->Integer, double -> Double...............
		Object tab13 = 512314.3241;			// '위와 같은 이유'
		
		
	}

}




