package chap0607;

public class Static_p277 {
	// 필드 
	String f1 = "인스턴스 필드 ";			// static이 붙지 않으면 instace 필드 
	static String f2 = "클래스(정적,static) 필드";
	
	
	void m1() {
		this.f1 = "m1() 메서드에서 접근";
		this.f2 = "m1() 메서드에서 접근";
		System.out.println("m1() 호출됨");
	} 
	
	static void m2() {
		// this.f1 = "m2() 메서드에서 접근";		// 에러 발생 (Cannot use this in a static context)
		// this.f2 = "m2()메서드에서 접근";
		// f1 = "m2() 메서드에서 접근";		// 에러 발생 (Cannot make a static reference to the non-static field)
		f2 = "m2() 메서드에서 접근";
		System.out.println("m2() 호출됨");
	}
	
	
	
	public static void main(String[] args) {
		// f1필드접근 X
		// f2필드접근 O
		// m1필드접근 X 
		// m2필드접근 O
		System.out.println(f2);		// static 멤버는 참조변수 없이 호출가능
		m2();						// static 멤버는 참조변수 없이 호출가능
		
		System.out.println();
		Static_p277 stat = new Static_p277();
		System.out.println(stat.f1);
		System.out.println(stat.f2);
		System.out.println(f2);		// static 멤버는 참조변수 없이 호출가능
		stat.m1();
		stat.m2();
		m2();		// static 멤버는 참조변수 없이 호출가능
		
		
	}

}
