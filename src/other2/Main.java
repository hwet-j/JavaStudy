package other2;

public class Main {
    public static void main(String[] args) {
//    	Animal animal = new Animal("동물",5);	// 추상 클래스로는 객체 생성이 불가
        Dog dog = new Dog("강아지",5);
        Cat cat = new Cat("고양이",7);
        
        dog.move();
        dog.bark();
        
        cat.move();
        cat.bark();
    }
}
