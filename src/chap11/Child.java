package chap11;

public class Child extends Parent{
	public String name;
	
	public Child() {
		this("이름"); // 자식 매개변수
		System.out.println("자식 기본생성자");
		//nation = "생성";
	}
	
	public Child(String name) {
		super();
		this.name = name;
		System.out.println("자식 매개변수 : " + this.name);
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		// System.out.println(child.nation);
	}
}
