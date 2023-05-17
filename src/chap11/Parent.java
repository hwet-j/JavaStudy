package chap11;

public class Parent {
	public String nation;
	
	public Parent() {		// 기본생성자
		this("나라"); // 부모 매개변수
		System.out.println("부모 기본생성자");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("부모 매개변수 : " + this.nation);
	}
}
