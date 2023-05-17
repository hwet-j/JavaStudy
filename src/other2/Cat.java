package other2;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    
    // 일반 메서드 오버라이딩
    @Override
    public void move() {
    	System.out.println(this.age + "살 짜리 고양이가 움직인다. (일반메서드 오버라이딩 - 선택사항)");
    }
    
    // 추상 메서드 오버라이딩 필수
    @Override
    public void bark() {
        System.out.println("야옹~~ (추상메서드 오버라이딩 - 필수)");
    }; 
}