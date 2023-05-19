package chap08;


// 실행 클래스 
public class RemoteController {
	public static void main(String[] args) {
		// -> 인터페이스는 타입이 가능하다.
		System.out.println("참조타입을 인터페이스로 ");
		System.out.println("생성자 Tv");
		RemoteControl remo = new Tv();
		System.out.println(remo.MAX_VOLUME);
		remo.turnOff();
		remo.turnOn();
		remo.setVolume(14);
		remo.setVolume(3);
		remo.setVolume(-41);
		remo.setVolume(6);
		System.out.println();
		System.out.println("생성자 Audio");
		RemoteControl remoa = new Audio();
		remoa.turnOff();
		remoa.turnOn();
		remoa.setVolume(14);
		remoa.setVolume(3);
		remoa.setVolume(-41);
		remoa.setVolume(6);
		
		System.out.println();
		System.out.println("참조타입을 Tv, Audio");
		Tv tv = new Tv();
		Audio aud = new Audio();
		tv.turnOn();
		aud.turnOn();
		tv.setVolume(88);
		tv.setVolume(8);
		tv.setVolume(-1);
		tv.setVolume(3);
		aud.setVolume(14);
		aud.setVolume(5);
		aud.setVolume(-51);
		aud.setVolume(9);
		tv.turnOff();
		aud.turnOff();
		
	}
}
