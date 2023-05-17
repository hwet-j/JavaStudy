package other2;

public abstract class Animal {
	// 필드는 추상 필드라는 개념이 존재하지 않음
    String name;
    int age;
    
    // 추상 클래스도 생성자가 존재한다.
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 일반 메서드 (오버라이딩 선택)
    public void move() {System.out.println("이동한다 (추상클래스에 선언된 일반 메서드)");}
    public void eat() {System.out.println("먹는다 (추상클래스에 선언된 일반 메서드)");}
    // 추상 메서드 (오버라이딩 필수) 
    public abstract void bark();
}

