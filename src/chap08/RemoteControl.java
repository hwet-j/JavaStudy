package chap08;

// 인터페이스는 상수와 추상메서드만 존재가능하기 때문에
// abstract, static final 키워드를 작성하지 않아도 자동으로 설정된다.
public interface RemoteControl {
	int MIN_VOLUME = 0;
	int MAX_VOLUME = 10;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
