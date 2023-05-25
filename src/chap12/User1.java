package chap12;

// p535
public class User1 extends Thread{
	private Calculator calculator;
	
	public void setCalulator(Calculator calculator) {
		this.setName("UUSSEERR1");	// Thread의 메서드를 사용(Thread 이름설정)
		this.calculator = calculator;	// 공유 객체인 calculator를 필드에 저장
	}
	
	// Thread Runnable 인터페이스 에서 선언한 추상메서드 run()을 오버라이딩
	// Thread의 run()
	public void run() {
		calculator.setMomory(100);		// 공유 객체인 calculator의 메모리에 100을 저장
	}
	

}
