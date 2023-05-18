package 상속;

public class Child extends Parent{
	public String name = "자식";
	
	public Child() {
		this("이름"); // 자식 매개변수
		System.out.println("자식 기본생성자");
		//nation = "생성";
	}
	
	public Child(String name) {
		super("Ddㅇ");
		this.name = name;
		System.out.println("자식 매개변수 : " + this.name);
	}
	
	@Override
	public void overrideTest() {
		//super.overrideTest();
		System.out.println(this.name + "오버라이딩 함");
	}
	
	public static void main(String[] args) {
		Parent child = new Child();
		// System.out.println(child.nation);
		child.overrideTest();
	}
	
}
