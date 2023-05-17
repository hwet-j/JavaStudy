package chap0607;

import chap11.Child;

// this 키워드 사용지 주의 사항 
// 1. this 키워드를 통해 같은 클래스 내 다른 생성자를 호출시에 코드의 가장 첫째 줄에 선언되어야 한다.
// 2. 재귀적 호출이 불가능하다. (같은 생성자 2회이상 호출 불가)
// 3. 만약 상속받았다면, this보다 super 키워드가 먼저 실행된다. ( 자식의 생성자보다 부모의 생성자의 호출완료가 먼저 )


/*
this : 해당 클래스의 객체주소가 저장된 참조변수
this() : (동일 클래스 내의) 다른 생성자 호출

super : 해당 클래스의 상위클래스의 객체주소가 저장된 참조변수
super() : 상위클래스의 생성자 호출
*/

public class This_Super_p248 {
	public String name;
	public String name2;
	
	public This_Super_p248() {		// 기본생성자
		this("1111");	 
		System.out.println("기본생성자");
	}
	
	public This_Super_p248(String name) {
		// this(name);		// 자기 자신을 불러올 수 없다. (재귀적 호출 불가)
		this(name, "2222");	 
		System.out.println("매개변수하나의 생성자 : " + name);	
	}
	
	public This_Super_p248(String name, String name2) {
		// this(name);	// ==> 이미 불러와진 생성자는 다시 불러올수 없다. (재귀적 호출 불가)
		this.name2 = name2;
		System.out.println("매개변수두개의 생성자 : " + this.name + this.name2);
		// this.name = name 을 해주지 않았기 때문에 입력된 변수인 1111이 출력되지 않고 현재클래스의 name 기본값 null이 출력된다. 
	}
	
	public static void main(String[] args) {
		System.out.println("기본 클래스");
		This_Super_p248 thisTest = new This_Super_p248();
		System.out.println();
		System.out.println("상속받은 클래스 (부모 , 자식)");
		System.out.println("====================");
		//Daughter dau = new Daughter();
		Daughter dau2 = new Daughter("ㅎㅎ");
		
	}
}


class GrandMother{
	public String grandma;
	
	public GrandMother() {		// 기본생성자
		// this("조부모"); // 조부모 매개변수
		System.out.println("조부모 기본생성자");
	}
	
	public GrandMother(String grandma) {
		System.out.println("조부모 매개변수 : " + grandma);
	}
}


class Mother extends GrandMother{
	public String nation;
	
	public Mother() {		// 기본생성자
		this("부모"); // 부모 매개변수
		System.out.println("부모 기본생성자");
	}
	
	public Mother(String nation) {
		System.out.println("부모 매개변수 : " + nation);
	}
}


class Daughter extends Mother{
	public String name;
	
	public Daughter() {
		this("자식"); // 자식 매개변수
		System.out.println("자식 기본생성자");
	}
	
	// 생성자 오버로딩 (동일한 이름을 가지고 있지만, 매개변수의 타입 또는 개수 또는 순서가 다른 형식을 선언하는것) 
	public Daughter(String name) {
		// super(name);
		System.out.println("자식 매개변수 : " + name);
	}
}


















