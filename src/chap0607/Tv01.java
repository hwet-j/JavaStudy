package chap0607;

import java.util.Date;

public class Tv01 extends Machine01_p310{
	int volume;
	String resolution;
	int speed=0;
	public static int maxspeed = 300;
	
	public Tv01() {
		brand = "Samsung";
		color = "red";
		productionDay = new Date();
		power = false;
	}
	
	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
	}
	
	@Override
	void powerOff() {
		// TODO Auto-generated method stub
		super.powerOff();
	}
	
	void showVolume() {
		System.out.println("현재 볼륨은 " + this.volume + "입니다.");
	}
	
	void speedUp(int speed) {
		if (this.speed + speed > 300) {
			System.out.println("최고속도를 넘을 수 없습니다.");
		} else {
			this.speed += speed;
			System.out.println("속도를 올려 현재 속도는 " + this.speed + " 입니다.");
			// ==> 속도를 print해주는 메서드를 작성해서 그 메서드를 사용해도 된다.(메서드로 선언해서 불러야 유지보수에 용이하다.)
		}
	}
	
	void speedDown(int speed) {
		if (this.speed - speed < 0) {
			System.out.println("속도가 -를 값을 가질 수 없습니다.");
		} else {
			this.speed -= speed;
			System.out.println("속도를 낮춰 현재 속도는 " + this.speed + " 입니다.");
		}
	}
	
	void volumeUp(int volume) {
		if (this.volume + volume > 50) {
			System.out.println("소리는 50이 최대입니다." + this.volume + " 입니다.");
		} else {
			this.volume += volume;
			showVolume();		// 메서드를 사용한 현재 볼륨 출력 ( 메서드를 사용해야 유지보수에 용이함 )
		}
	}
	
	void volumeDown(int volume) {
		if (this.volume - volume < 0) {
			System.out.print("소리는 0밑으로 내려갈 수 없습니다.");
			showVolume();		// 메서드를 사용한 현재 볼륨 출력 ( 메서드를 사용해야 유지보수에 용이함 )
		} else {
			this.volume -= volume;
			showVolume();		// 메서드를 사용한 현재 볼륨 출력 ( 메서드를 사용해야 유지보수에 용이함 )
		}
	}
	

}
