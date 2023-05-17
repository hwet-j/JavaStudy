package chap0607;

public class InTestChild extends InTestParent{
	InTestChild (String name, int price){		// 생성자
		this.name = name;
		this.price = price;
	}
	
	
	public static void main(String[] args) {
		InTestChild Child = new InTestChild("책이름책이름", 20000);
		Child.Print();
	}
}
