package chap0607;
// Casting : 강제타입변환 ( 부모 -> 자식 )

class GrandMother01{
	int age = 80;
	void ski() {System.out.println("할머니 ski()");}
	void drive() {System.out.println("할머니 drive() 자동차");}
}

class Mother01 extends GrandMother01{
	int age = 50;
	void cook() {System.out.println("엄마 cook()");}
	@Override
	void drive() {System.out.println("엄마 drive() 배");}
}

class Daughter01 extends Mother01{
	int age = 20;
	void study() {System.out.println("딸 study()");}
	@Override
	void drive() {System.out.println("딸 drive() 비행기");}
}


public class Cating01_p348 {
	public static void main(String[] args) {
		Daughter01 dd1 = new Daughter01();
		Mother01 mm1 = new Mother01();
		GrandMother01 gg1 = new GrandMother01();
		
		GrandMother01 dd2 = new Daughter01();
		Mother01 mm2 = new Daughter01();
		GrandMother01 gg2 = new GrandMother01();
		
		Daughter01 dd3 = (Daughter01) dd2;
		System.out.println(System.identityHashCode(dd2));
		System.out.println(System.identityHashCode(dd3));
		System.out.println("dd2");
		System.out.println(dd2);
		System.out.println(dd3);
		System.out.println();
		System.out.println(dd2.age);
		dd2.drive();
		dd2.ski();
		System.out.println("\ndd3");
		dd3.drive();
		dd3.cook();
		dd3.study();
		System.out.println(dd3.age);
		
		
		System.out.println("====================");
		Daughter01 dd4 = (Daughter01) mm2;
		System.out.println("mm2");
//		System.out.println(mm2);
//		System.out.println(dd4);
		System.out.println(mm2.age);
		mm2.drive();
		mm2.ski();
		mm2.cook();
		System.out.println("\ndd4");
		System.out.println(dd4.age);
		dd4.drive();
		dd4.ski();
		dd4.cook();
		dd4.study();
		
		System.out.println();
		Mother01 dd5 = dd4;
		System.out.println(dd5.age);
		dd5.drive();
		dd5.ski();
		dd5.cook();
		
//		Daughter01 dd5 = (Daughter01) new Mother01();
//		Daughter01 dd6 = (Daughter01) new GrandMother01();
		int age1 = ((GrandMother01)dd2).age;
		int age2 = ((Mother01)dd2).age;
		int age3 = ((Daughter01)dd2).age;
		
		// 맴버변수는 Heap에 저장되어 해당 변수를 가져와 출력한다.
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		
		// 메서드는 Stack에 저장된 값을 호출하기 때문에 마지막에 저장된 값을 출력한다.(동일변수명 - 오버라이딩 된 메서드) - 내생각.. 
		((GrandMother01)dd2).drive();
		((Mother01)dd2).drive();
		((Daughter01)dd2).drive();
		
		System.out.println();
		// 객체 타입확인 : instanceof 키워드.
		System.out.println("참조변수 확인");
		if (dd2 instanceof Daughter01) {
			System.out.println("옙!");
		} else {
			System.out.println("dd2는 아님");
		}
		if (mm1 instanceof Daughter01) {
			System.out.println("옙!");
		} else {
			System.out.println("mm1는 아님");
		}
		// ==> instanceof 키워드는 강제형변환을 실행 시키기 이전에 작성하는 것이 에러를 방지는 옳은 방법이고,
		// if문으로 작성하여 객체타입이 포함하면 형변환을 시키고 그렇지 않으면 변환하지 않는 방식으로 작성한다. 
	}

}
