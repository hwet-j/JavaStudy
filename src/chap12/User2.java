package chap12;

// p535
public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalulator(Calculator calculator) {
		this.setName("UUSSEERR22");	// Thread의 메서드를 사용(Thread 이름설정)
		
		this.calculator = calculator;
	}
	
	// Thread Runnable 인터페이스 에서 선언한 추상메서드 run()을 오버라이딩
	// Thread의 run()
	public void run() {
		calculator.setMomory(200);
	}
	

}
