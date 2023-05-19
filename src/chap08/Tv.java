package chap08;
// p.378
// 인터페이스 RemoteControl의 구현 클래스
public class Tv implements RemoteControl{
	private int volume;
	
	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {			// MAX_VOLUME을 현재 클래스에서 정의하지 않았지만 인터페이스에서 설정되어있기 때문에 자동인식
			this.volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 turnOff()");
		
	}
	@Override
	public void turnOn() {
		System.out.println("TV를 turnOn()");
		
	}
}
