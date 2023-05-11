package chap06;
// 학생클래스의 객체를 생성하여 필드와 메서드를 사용
public class Student_Ex {

	public static void main(String[] args) {
		Student std = new Student();
		std.printAge();
		std.printName();
		
		std.setAge(28);
		std.setName("홍길동");
		System.out.println(std.getAge());
		System.out.println(std.getName());

		
	}

}
