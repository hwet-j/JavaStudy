package chap12;

// 
public class MainThread_p534 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 u1 = new User1();
		u1.setCalulator(calculator);	// 공유 객체 생성
		u1.start();				// User1 스레드 시작
		
		
		
		User2 u2 = new User2();
		u2.setCalulator(calculator);
		u2.start();
		
	}

}
