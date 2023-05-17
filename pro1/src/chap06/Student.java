package chap06;
// 학생 클래스를 설계 ( 내 마음대로 )
public class Student {
	// 필드를 private 제한
	private String name = "김철수";
	private int age = 30;
	private String grade = "A";
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGrade(String grage) {
		this.grade = grade;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String Grade() {
		return this.grade;
	}
	
	
	void printName() {
		System.out.printf("학생의 이름은 %s 입니다.\n", name);
	}
	
	void printName(String freind) {
		System.out.printf("학생 %s의 친구는 %s 입니다.\n", name, freind);
	}
	
	void printAge() {
		System.out.printf("학생의 나이는 %d세 입니다.\n", age);
	}
	
}
