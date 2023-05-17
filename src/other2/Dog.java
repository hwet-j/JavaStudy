package other2;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }
    
    // 추상 메서드 오버라이딩 필수
    @Override
    public void bark() {
        System.out.println("멍멍!!  (추상메서드 오버라이딩 - 필수)");
    }; 
}